// Setup Variables
// import processing.sound.*;
PImage cow, pig, chicken, goat, smurf, donkey, knife, knife2, tree, cereal, chosenCharacter;
PImage start, end;
boolean gameInstr, gameSelect, gameStart;
// SoundFile introMoo;

// Environment Variables
int shiftY;
Environment[] envs = new Environment[4];
int currEnv;
ArrayList<Environment> allEnv;

// Entity Variables
Duck duck;
final int duckV = 60;
ArrayList<Entity> allEnt;

// Points
int pts;
int netPts;

/************************ CROSSY ROAD ***************************/
void setup(){

  // FINAL Setup
  size(480, 720);
  envs[0] = new Grass();
  envs[1] = new Road();
  envs[2] = new Road();
  envs[3] = new Milk();

  // Load PNGs
  cow = loadImage("cow.png");
  pig = loadImage("pig.png");
  chicken = loadImage("chiken.png"); 
  goat = loadImage("goat.png");
  smurf = loadImage("smurf.png");
  donkey = loadImage("donkey.png");
  knife = loadImage("knife.png");
  knife2 = loadImage("knife2.png");
  tree = loadImage("tree.png");
  cereal = loadImage("cereal.png");
  start = loadImage("start.png");
  end = loadImage("death.png");

  newStart();

}


void newStart() {
  
  loop();

  // Preparation
  size (480, 720);
  gameInstr = false;
  gameSelect = false;
  gameStart = false;
  shiftY = 0;
  pts = 0;
  netPts = 0;
  duck = new Duck();

  // Set Game Background
  allEnv = new ArrayList<Environment>();
  allEnt = new ArrayList<Entity>();
  currEnv = 0;
  for (int i = 0; i < 13; i ++) {
    allEnv.add(envs[currEnv]);
  }

  // Start Screen
  image(start, 0, 0);
  textSize(27);
  text("PRESS SPACE TO READ INSTRUCTIONS", 25, 50);

  // // Mooing
  // introMoo = new SoundFile(this, "cow.wav");
  // introMoo.amp(0.3);
  // introMoo.play();
}

void keyPressed() {

  // To Start
  if (key == ' ') {
    if (!gameInstr) {
      gameInstr = true; // Press space to go to instructions
    } else if (!gameSelect) {
      gameSelect = true; // Press space to go to duck selection
    } else if (!gameStart) {
      gameStart = true; // Press space to start
    }
  }

  // To Restart
  if (key == 'R' || key == 'r') {
    newStart();
    redraw();
  }
    
  if (gameStart) {

    // Move Up
    if (key == 'W' || key == 'w'){
      duck.moveY(-duckV);

      // Cannot move if a Tree is in the path
      if (!checkMove()) {
        duck.moveY(duckV);
        return;
      }

      netPts = netPts + 1;
      updatePts();
    }
    
    // Move Down
    if (key == 'S' || key == 's'){
      duck.moveY(duckV);

      // Cannot move if a Tree is in the path
      if (!checkMove()) {
        duck.moveY(-duckV);
        return;
      }

      netPts = netPts - 1;
      updatePts();
    }

    // Move Left
    if (key == 'A' || key == 'a'){
      duck.moveX(-duckV);

      // Cannot move if a Tree is in the path
      if (!checkMove()) {
        duck.moveX(duckV);
        return;
      }
    }

    // Move Right
    if (key == 'D' || key == 'd'){
      duck.moveX(duckV);

      // Cannot move if a Tree is in the path
      if (!checkMove()) {
        duck.moveX(-duckV);
        return;
      }
    }

  }

}

void draw() {
  
  // Instruction Screen
  if (gameInstr && !gameSelect) {
    background(105, 206, 236);
    image(cow, 0, 450);
    cow.resize(170, 190);
    fill(255);
    textSize(50);
    text("HOW TO PLAY:", 80, 100);

    // Creating Rectangle
    fill(236, 233, 216);
    rect(60, 180, 360, 240);
    String s = "Use WASD to move the cow (W - Up, A - Left, S - Down, D - Right). Avoid knives and trees. Get on the cereal to avoid drowning in the milk river. Good luck!";
    fill(0);
    textSize(24);

    // Shaping Text To Fit Rectangle
    text(s, 70, 205, 350, 240);
    text("PRESS SPACE TO CONTINUE", 170, 550);
  }

  // Character Selection Screen
  if (gameSelect && !gameStart) {
    background(105, 206, 236);
    textSize(45);
    fill(255);

    // Creating Title Text
    text("Choose your character:", 23, 60);
    textSize(30);

    // Creating Cow
    image(cow, 10, 70);
    text("[1]", 79, 280);
    // Creating Pig
    image(pig, 280, 80);
    pig.resize(170, 170);
    text("[2]", 360, 280);
    // Creating Smurf
    image(smurf, -30, 290);
    smurf.resize(290, 210);
    text("[3]", 90, 513);
    // Creating Donkey
    image(donkey, 280, 280);
    donkey.resize(160, 200);
    text("[4]", 350, 510);
    // Creating Chicken
    image(chicken, 50, 530);
    chicken.resize(140, 160);
    text("[5]", 150, 690);
    // Creating Goat
    image(goat, 250, 520);
    goat.resize(180, 170);
    text("[6]", 410, 690);

    // Default Selection
    chosenCharacter = cow;
    
    // Manual Selection
    if (keyPressed) {
      if (key == '1') {
        chosenCharacter = cow;
        gameStart = true;
      }
      if (key == '2') {
        chosenCharacter = pig;
        gameStart = true;
      }
      if (key == '3') {
        chosenCharacter = smurf;
        gameStart = true;
      }
      if (key == '4') {
        chosenCharacter = donkey;
        gameStart = true;
      }
      if (key == '5') {
        chosenCharacter = chicken;
        gameStart = true;
      }
      if (key == '6') {
        chosenCharacter = goat;
        gameStart = true;
      }
    }
  }
  
  // Game Screen
  if (gameStart) {

    checkDeath();

    if (shiftY == 59) {
      int randomX, randomDx; // temp data storage
      currEnv = int(random(4));    
      allEnv.remove(0);
      allEnv.add(envs[currEnv]);

      if (allEnt.size() > 26) {
        allEnt.remove(0);
        allEnt.remove(0);
      }

      if (currEnv == 0 ) {
        allEnt.add(new Tree(int(random(8)) * 60, -61));
        allEnt.add(new Tree(int(random(8)) * 60, -61));
      }
      if (currEnv == 1) {
        randomX = int(random(480));
        randomDx = int(random(1, 3));
        allEnt.add(new Knife(randomX, -61, -randomDx));
        allEnt.add(new Knife(randomX + (int(random(8)) * 60), -61, -randomDx));
      }
      if (currEnv == 2) {
        randomX = int(random(480));
        randomDx = int(random(3)) + 1;
        allEnt.add(new Knife(randomX, -61, randomDx));
        allEnt.add(new Knife(randomX + (int(random(8)) * 60), -61, randomDx));
      }
      if (currEnv == 3 ) {
        randomX = int(random(480));
        randomDx = int(random(3)) + 1;
        if (int(random(2)) == 0) {
          randomDx = randomDx * -1;
        }
        allEnt.add(new Cereal(randomX, -61, randomDx));
        allEnt.add(new Cereal(randomX + (int(random(1, 7)) * 60), -61, randomDx));
      }

      shiftY = 0;

    } else {
      shiftY ++;
    }

    // Shift Entities
    duck.setY(duck.getY() + 1);
    for (Entity ent : allEnt) {
      ent.setY(ent.getY() + 1);
      ent.move(); // Natural movement
    }
    if (duck.onCereal()) {
      duck.setX(duck.getX() + duck.getCerealDx());
    }


    // Draw Board
    for (int i = 0; i < 13; i ++) {
      allEnv.get(i).drawEnv((11-i) * 60 + shiftY);
    }
    for (Entity ent : allEnt) {
      if (ent.getType() == 0) {
        image(tree, ent.getX(), ent.getY(), 60, 60);
      }
      if (ent.getType() == 1) {
        image(knife, ent.getX(), ent.getY(), 60, 60);
      }
      if (ent.getType() == 2) {
        image(knife2, ent.getX(), ent.getY(), 60, 60);
      }
      if (ent.getType() == 3) {
        image(cereal, ent.getX(), ent.getY(), 60, 60);
      }
    }

    // Draw Cow
    image(chosenCharacter, duck.getX(), duck.getY(), 60, 60);

    // Display Score
    fill(255);
    textSize(50);
    text(pts, 20, 60);

  }

  if (duck.isDead()) {
    background(0);
    image(end, 60, 120);
    end.resize(400, 400);
    textSize(24);
    text("GAME OVER", 30, 100);
    text("Score: " + pts, 30, 150);
    text("PRESS R TO RESTART", 230, 600);
  }

}

// true if duck can move
boolean checkMove() {
  boolean canMove = true;
  boolean wasOnCereal = duck.onCereal();
  int currX = duck.getX();
  duck.offCereal();

  for (Entity ent : allEnt) {
    // Is a Tree in the path?
    if (ent.getType() == 0 && ent.isHere(duck)) {
      canMove = false;
    }

    // Is a Cereal in the path? If so, toggle onCereal to true and adjust duck's coordinate
    if (ent.getType() == 3 && ent.inRange(duck)) {
      duck.setX(ent.getX());
      duck.ontoCereal();
      duck.setCerealDx(ent.getDx());
    }

  }

  // Officially offCereal
  if (wasOnCereal && !duck.onCereal()) { // Reposition to 8 by 12 grid
      duck.setX(round((float) currX / 60) * 60);
  }

  // Borders
  if (duck.getX() >= width || duck.getX() < 0) {
    canMove = false;
  }
  if (duck.getY() < 0) {
    canMove = false;
  }

  return canMove;
}

// true if duck is on a knife
void checkDeath() {
  boolean death = false;

  for (Entity ent : allEnt){
    // Knife Death
    if ((ent.getType() == 1 || ent.getType() == 2) && ent.inRange(duck)) {
      death = true;
    }
    // Milk Death
    if (ent.getType() == 3 && ent.getY() == duck.getY()) {
      death = !(duck.onCereal());
    } // onCereal: true when duck is on land or Cereal, false when duck is in Milk
  }

  if (duck.getY() > height) {
    death = true;
  }

  if (duck.onCereal() && (duck.getX() > 510 || duck.getX() < - 30)) {
    death = true;
  }
  
  if (death) {
    duck.kill();
  }
}

// Update Points
void updatePts() {
  if (netPts > pts) {
    pts = netPts;
  }
}
