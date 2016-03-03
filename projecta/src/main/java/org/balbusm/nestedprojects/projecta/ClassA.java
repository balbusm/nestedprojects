package org.balbusm.nestedprojects.projecta;

import java.sql.SQLException;

import org.h2.tools.Server;

public class ClassA {
    public void startServer() {
        try {
            Server server = Server.createTcpServer("").start();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
