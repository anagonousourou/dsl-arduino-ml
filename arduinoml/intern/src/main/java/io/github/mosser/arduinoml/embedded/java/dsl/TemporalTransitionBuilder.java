package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.TemporalTransition;

public class TemporalTransitionBuilder {
    private static int temporalTransitionBuilderCounts = 1;
    private State next;
    private long after;
    private long number;
    private String sourceState;
    private TransitionTableBuilder parent;

    public TemporalTransitionBuilder(TransitionTableBuilder parent, String sourceState, long duration) {
        this.sourceState = sourceState;
        this.parent = parent;
        this.after = duration;
        this.number = TemporalTransitionBuilder.temporalTransitionBuilderCounts++;
    }

    public TemporalTransitionBuilder milliseconds() {
        return this;
    }

    public TemporalTransitionBuilder seconds() {
        this.after = this.after * 1000;
        return this;
    }

    public TransitionTableBuilder goTo(String state) {
        this.next = this.parent.findState(state);
        parent.findState(this.sourceState)
                .addTemporalTransition(new TemporalTransition(this.next, this.after, this.number));
        return parent;
    }

}
