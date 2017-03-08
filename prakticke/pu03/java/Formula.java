import java.util.Set;
import java.util.List;

class Constant {
    public Constant(String name) {
        throw new RuntimeException("Not implemented");
    }

    public String name() {
        throw new RuntimeException("Not implemented");
    }

    public String eval(Structure m) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String toString() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean equals(Object other) {
        throw new RuntimeException("Not implemented");
    }
}

class Formula {
    public List<Formula> subfs() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public String toString() {
        throw new RuntimeException("Not implemented");
    }

    public boolean isTrue(Structure m) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean equals(Object other) {
        throw new RuntimeException("Not implemented");
    }

    public int deg() {
        throw new RuntimeException("Not implemented");
    }

    public Set<AtomicFormula> atoms() {
        throw new RuntimeException("Not implemented");
    }

    public Set<String> constants() {
        throw new RuntimeException("Not implemented");
    }

    public Set<String> predicates() {
        throw new RuntimeException("Not implemented");
    }
}

class AtomicFormula extends Formula {
    AtomicFormula() {
        throw new RuntimeException("Not implemented");
    }
}

class PredicateAtom extends AtomicFormula {
    PredicateAtom(String name, List<Constant> args) {
        throw new RuntimeException("Not implemented");
    }

    String name() {
        throw new RuntimeException("Not implemented");
    }

    List<Constant> arguments() {
        throw new RuntimeException("Not implemented");
    }
}

class EqualityAtom extends AtomicFormula {
    EqualityAtom(Constant left, Constant right) {
        throw new RuntimeException("Not implemented");
    }

    Constant left() {
        throw new RuntimeException("Not implemented");
    }

    Constant right() {
        throw new RuntimeException("Not implemented");
    }
}

class Negation extends Formula {
    Negation(Formula originalFormula) {
        throw new RuntimeException("Not implemented");
    }

    public Formula originalFormula() {
        throw new RuntimeException("Not implemented");
    }
}

class Disjunction extends Formula {
    Disjunction(List<Formula> disjuncts) {
        throw new RuntimeException("Not implemented");
    }
}

class Conjunction extends Formula {
    Conjunction(List<Formula> disjuncts) {
        throw new RuntimeException("Not implemented");
    }
}

class BinaryFormula extends Formula {
    BinaryFormula(Formula left, Formula right) {
        throw new RuntimeException("Not implemented");
    }

    public Formula leftSide() {
        throw new RuntimeException("Not implemented");
    }

    public Formula rightSide() {
        throw new RuntimeException("Not implemented");
    }
}

class Implication extends BinaryFormula {
    Implication(Formula left, Formula right) {
        super(left, right);
        throw new RuntimeException("Not implemented");
    }
}

class Equivalence extends BinaryFormula {
    Equivalence(Formula left, Formula right) {
        super(left, right);
        throw new RuntimeException("Not implemented");
    }
}
