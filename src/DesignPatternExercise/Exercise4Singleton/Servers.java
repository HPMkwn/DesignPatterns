package DesignPatternExercise.Exercise4Singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum Servers implements Serializable {

    INSTANCE;

    private final List<String> serversList;

    Servers() {
        serversList = new ArrayList<>();
    }

    public static Servers getInstance(){
        return INSTANCE;
    }

    public boolean addServer(String server){
        if((server.startsWith("http") || server.startsWith("https")) && !serversList.contains(server)){
            return serversList.add(server);
        }
        return false;
    }

    private List<String> getServersStartingWith(final String prefix) {
        return serversList.stream()
                .filter(server -> server.startsWith(prefix))
                .collect(Collectors.toUnmodifiableList());
    }
    public List<String> findHttpServer(){
        return getServersStartingWith("http");
    }

    public List<String> findHttpsServer(){
        return getServersStartingWith("https");
    }




}
