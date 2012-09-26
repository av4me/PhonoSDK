package org.minijingle.jingle.transport;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("candidate")
public class Candidate {

    @XStreamAsAttribute
    private final String ip, port, generation, id, component;

    public Candidate(String ip, String port, String generation) {
        this.ip = ip;
        this.port = port;
        this.generation = generation;
        this.id = "1";
        this.component = "1";
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public String getGeneration() {
        return generation;
    }
}
