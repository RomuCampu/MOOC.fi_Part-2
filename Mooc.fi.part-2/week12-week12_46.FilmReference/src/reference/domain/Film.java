package reference.domain;

public class Film {

    private String name;

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Film{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;

        int compare = this.name.compareToIgnoreCase(other.name);

        if (compare < 0) {
            // name is less
        } else if (compare > 0) {
            // name is greater
        } else {
            return true;
        }
        return false;
    }

}
