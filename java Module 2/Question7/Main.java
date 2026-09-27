class Team {
    String name;
    int matchesPlayed;
    int wins;
    int draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {

    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 2) + (draws * 1);
    }
}

class FootballTeam extends Team {

    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return (wins * 3) + (draws * 1);
    }
}

public class Main {
    public static void main(String[] args) {

        String input1 = "Cricket,India,10,6,2";
        String input2 = "Football,Barcelona,8,6,1";

        String[] data1 = input1.split(",");
        String[] data2 = input2.split(",");

        Team cricket = new CricketTeam(
            data1[1],
            Integer.parseInt(data1[2]),
            Integer.parseInt(data1[3]),
            Integer.parseInt(data1[4])
        );

        Team football = new FootballTeam(
            data2[1],
            Integer.parseInt(data2[2]),
            Integer.parseInt(data2[3]),
            Integer.parseInt(data2[4])
        );

        System.out.println("Team: " + cricket.name +
                " (Cricket) Points: " + cricket.calculatePoints());

        System.out.println("Team: " + football.name +
                " (Football) Points: " + football.calculatePoints());
    }
}