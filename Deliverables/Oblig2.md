# Oblig2 - Sky7 RoboRally

## Part 1

- Group name: Sky7.
- Team lead: Carl August Gjørsvik.
- Key account manager: Brigt Arve Toppe Håvardstun.

### Competence
  
In summary, every team member has the programming skills needed for this task and some additional abilities which could potentially improve the project's workflow. Every team member has taken courses INF100, INF101 and INF102. Thus we are all experienced with OOP.

- Henrik:
  - Network
  - Made games in java.
- Carl:
  - Network
  - Made games in java.
  - Word/Excel (Data representation) through professional work.
  - Competitive programming
- Maren:
  - Competitive programming
- Brigt:
  - JavaFX
  - Competitive programming
  - PLays board games 
- Fromsa:
  - Python 
  - Haskell 
  - Competitive programming

### Technical tools to be used:
- Programming
  - Java (Eclipse, IntelliJ)
  - LibGDX
  - Git version control.
- Communication
  - Slack
  - Github project board
- Other
  - Adobe photoshop

## Part 2

### Overall goal of application
Create a PC-game implementation of the board game RoboRally. 
It should be playable by 2 to 8 players from 8 PCs on the same network. 
Some simplifications must be done; remove “Option” cards, remove timer.

### Application Requirements
- Board
  - Static tiles
  - Holes
  - Walls
  - Floor
  - Interacting tiles
  - Backup station
  - Cogwheel
  - Repair station
  - Laser
  - Piston
  - Conveyor belt
  - Flags
  - 1 Robot per grid square
- Robots
  - Visible
  - Position on board
  - Movable
  - Health
  - Laser
  - Power-down (repair)
- UI-border
  - Health status
  - Cards on hand
  - Cards in play
- Cards
  - Priority
  - Actions (Instructions)
- Game rounds
  - Before round
    - Hand out cards
    - Players can move cards from hand to play
    - Players can click ready when instructions are complete / auto ready if powerdown
  - 5 Phases
    - Reveal cards and move robots in order of priority
	- Robots take damage from attacks (may lock cards in registry)
  - After round
    - Repair
	- Return cards (not locked) to deck

### Priority in the first iteration
1. The overall structure of the boardgame
2. Create Interfaces in accordance with structure plan
3. Get a basic understanding of LibGDX
4. Create a barebone game class with a visual board and 1 robot
5. Prepare a presentation

## Part 3

### Process- and project plan
We selected a combination of Kanban and Scrum. There are no pre-defined roles for the team. Although, there are technically lead and account manager, the team is encouraged to collaborate and chip in when any one person becomes overwhelmed. Deliverables are determined by sprints, or set periods of time in which a set of work must be completed and ready for review. For delegation and prioritization we use a git project board, where each team member works on one issue at a time. This resembles a "pull system". We allow changes to be made to a project mid-stream, allowing for iterations and continuous improvement prior to the completion of a project, because the size of the project is not too big. Finally we measure productivity using velocity through sprints. Each sprint is laid out back-to-back and/or concurrently so that each additional sprint relies on the success of the one before it. 


### Programming process of the first programming:
Anyone can post on the backlog and everyone else can contribute in definition of the backlog issue, until it is approved and broken down into accurate tasks by the team lead and appended onto the todo list. Each team member should take and assign themselves an issue from the git projectboard. Any team member can only work on one issue at a time.

### Meetings:
  First wednesday after delivery a retrospektive-meeting will be held.
  The wednesday after that, a status-meeting will be held.
  Communication will be mainly over slack.

#### First meeting: 
  - introduction, start to create a plan, set up Trello, Slack, google doc and a priority list.
#### Second meeting: 
  - create a structure plan, discuss what to simplify from the board game.
#### Third meeting:  
  - Change from Trello to Git Project Board.
  - Plan the next step for our game.
  - When small changes are made, merge.
  - When significant changes are made: create a new pull request. 
  - Send notification on Slack if there is a new pull request.
#### Fourth meeting:
  - Discussion of what worked and did not work.
  - Discussion of next iteration of the project. A problem is spotted, and we have to change the structure slightly to accommodate for future multiplayer properties.

## Summary

### What worked:
  - The current code was completed without major problems.
  - The meetings were productive.
  - Workflow and communication is improving.
  
### What did not work:
Team agreed to use trello because it was supposedly easy, but there were too many platforms of communication to keep track of. This problem lead to some of the team members unknowingly working on the same issue. Thus not everybody had overview. Therefore, inorder to use fewer platforms we changed to git project board. It has improved the team members' awareness of the project's progression. 

### Plan for next iteration so far:
  - Start work on a "host" class controlling the game.
  - Add the cards to the game.
  - Move the bots.
  - Create a board generator that reads from a file storing the boards.

