public class Main {
    public static void main(String[] args) {
        CollectionofNames companyRepository = new CollectionofNames();
        for (Iterator iter = companyRepository.getIterator(); iter.hasNext();){
            String name = (String) iter.next();
            System.out.println("name is: "+name);
        }
    }
}
