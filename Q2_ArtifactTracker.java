import java.util.LinkedList;

class ArtifactTracker {
    public static void main(String[] args) {
        LinkedList<String> artifactList = new LinkedList<>();

        artifactList.add("Ancient Vase");
        artifactList.add("Mummy Case");
        artifactList.add("Golden Statue");

        artifactList.addFirst("Rosetta Stone");

        artifactList.remove("Mummy Case");

        System.out.println("First artifact: " + artifactList.getFirst());
        System.out.println("Last artifact: " + artifactList.getLast());

        System.out.println("Updated list: " + artifactList);
    }
}