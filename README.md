# football-world-cup-score-board
An implementation of Football World Cup Score Board that shows matches and scores.

1. The list of team will be initialized first.
2. World cup fixture will be created.
   1. List of teams will be iterated to populate home team, away team and other needed parameters.
3. Scoreboard is populated.
   1. Completed game will be added in one list.
   2. In progress games will be added in another list.
4. Completed matches' sorting
   1. First sorting the list based on total score (home score + away score) in descending order.
   2. Then sorting the list based on their finish time. System's current time is used for this purpose.
