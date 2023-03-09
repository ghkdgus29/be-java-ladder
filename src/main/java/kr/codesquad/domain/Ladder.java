package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private int ladderHeight;
    private List<String> people;

    private List<Line> ladder;

    public String make(List<String> people, int ladderHeight) {
        this.ladderHeight = ladderHeight;
        this.people = people;

        ladder = new ArrayList<>();
        for (int y = 0; y < ladderHeight; y++) {
            ladder.add(new Line(people));
        }

        return drawResult();
    }

    private String drawResult() {
        StringBuilder sb = new StringBuilder();

        for (Line line : ladder) {
            sb.append(line.draw() + "\n");
        }

        return sb.toString();
    }
}
