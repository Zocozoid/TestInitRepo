package com.example.newelocationapp.Model;

public class SysDiagrams {

    private String Name;
    private int PrincipalID;
    private int DiagramID;
    private int Version;
    private int Definition;

    public SysDiagrams(String name, int principalID, int diagramID, int version, int definition) {
        Name = name;
        PrincipalID = principalID;
        DiagramID = diagramID;
        Version = version;
        Definition = definition;
    }

    public SysDiagrams(String name) {
        Name = name;
    }

    public SysDiagrams(int principalID, int diagramID, int version, int definition) {
        PrincipalID = principalID;
        DiagramID = diagramID;
        Version = version;
        Definition = definition;
    }

    public SysDiagrams() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrincipalID() {
        return PrincipalID;
    }

    public void setPrincipalID(int principalID) {
        PrincipalID = principalID;
    }

    public int getDiagramID() {
        return DiagramID;
    }

    public void setDiagramID(int diagramID) {
        DiagramID = diagramID;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public int getDefinition() {
        return Definition;
    }

    public void setDefinition(int definition) {
        Definition = definition;
    }
}
