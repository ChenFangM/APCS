FIRE -- Brianna Tieu, Courtney Huang, Fang Chen
APCS pd6
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent: 0.5 hrs


DISCO
------------------------------------------------
* Is the Man Who Is Tall Happy relates to an animated documentary released in 2013.
================================================


QCC
------------------------------------------------
* Tall Man = Tall Tree?
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
A tree always grows downwards.

Provide as many alternate definitions as you can for "tree," using graph terminology 
("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
A tree is a graph with nodes that are all connected to one another through multiple paths.

Why is a balanced tree allowed a difference of 1 in height between right and left 
subtrees?
A balanced tree is allowed a difference of 1 in height between right and left subtrees 
because it allows for optimal efficiency when processing nodes utilizing a depth-first 
procedure.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
A tree with right and left subtrees that have a maximum height difference of one.

Is a perfect tree complete?
Yes, because every level is filled.

Is a complete tree balanced?
Yes, a complete tree is balanced.

Is the Man Who Is Tall Happy?
Yes, unless he hates children.

What must be true of perfect trees but not others?
All the levels must be completely filled.
================================================


C'EST POSSIBLE?
------------------------------------------------
The reconstruction would be impossible if the in-order MUST start its traversal at a node 
without children. Since both the in-order and pre-order traversals begin with E, we are left
with a finicky situation: E must be the root since pre-order always processes the root first,
but the root definitely has children since there exists oher nodes in the tree. That means that 
there's no way for the reconstruction of the pre-order to match the reconstruction of the 
in-order.

The reconstruction of the tree is possible, however, if that restriction didn't exist. There 
can be multiple outcomes for the structure of the tree if we were to consider the different 
types: perfect, complete, balanced, etc. The idea this claim is founded on is if you consider
the root E to have a "child" that is null and traverse starting from said null. Since it's
just imaginary, we don't "process" it and the first node processed will be E, and then E's 
children as per standard in-order traversal. In this way, it would definitely be possible to
trace a tree matching both the in-order and pre-order processes. 
================================================