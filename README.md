The proposed solution consists of a main class *App* and three extra classes: *Team*, *FootballGame* and *Utils*.

*Team* encapsulates information about name and score, while *FootballGame* encapsulates both home and away teams, as variables of type *Team*. *Utils* serves as a utility class to provide extra functions.

The process starts iterating over an array of team names, and instantiating new *FootballGame* variables, each one with randomly picked home/away *Team* names and scores. This *FootballGames* are added to a list in order to update the global scoreboard.

The summary is being ordered making use of basic sorting with built in Java Comparators
