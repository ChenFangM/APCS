public class Time{

	public static void main(String[] args){
		int hour, min, sec, secondsSinceMid;
		hour = 16;
		min = 17;
		sec = 45;
		secondsSinceMid = hour * 3600 + min * 60 + sec;
		System.out.println("Seconds since midnight: " + secondsSinceMid);
		System.out.println("Seconds till tomorrow: " + (86400 - secondsSinceMid));
		double percentOfDay = (secondsSinceMid * 100.0) / 86400.0;
		System.out.println("Percent of day: " + percentOfDay + "%");
		hour = 16;
		min = 26;
		sec = 31;
		System.out.println("Seconds elapsed: " + (hour * 3600 + min * 60 + sec - secondsSinceMid));
	}

}