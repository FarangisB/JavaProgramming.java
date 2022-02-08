package day44_Abstraction.AnimalTask;

public interface Playable {

    static boolean isFriendly=true; // static and final is by default variables in interface

    public abstract  void play(); // public and abstract keywords are not mandatory, they're given by default
}
