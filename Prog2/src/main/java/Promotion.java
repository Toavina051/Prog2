import java.util.List;

public class Promotion {
    private List<String> groupes;

    public Promotion(List<String> groupes) {
        this.groupes = groupes;
    }

    public List<String> getGroupes() {
        return groupes;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "groupes=" + groupes +
                '}';
    }
}

