package homework;

public class User implements UserOperations{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public void save(){
        IPersisterble persister = new Persister(this);
        persister.save();
    }
    @Override
    public void report(){
        System.out.println("Report for user: " + name);
    }

}
