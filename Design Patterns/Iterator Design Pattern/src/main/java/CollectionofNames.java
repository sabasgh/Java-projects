public class CollectionofNames implements Container {

    public String names[] = {"saba", "naser", "sadaf", "violet"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate();
    }

    private class CollectionofNamesIterate implements Iterator {
        int i;

        @Override
        public Boolean hasNext() {
            if (i < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[i++];
            }
            return null;
        }
    }
}
