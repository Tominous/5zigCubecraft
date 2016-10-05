package net.frozenbit.plugin5zig.cubecraft;


import net.frozenbit.plugin5zig.cubecraft.listeners.*;

public class ServerInstance extends eu.the5zig.mod.server.ServerInstance {
    @Override
    public void registerListeners() {
        getGameListener().registerListener(new GameListener());
        getGameListener().registerListener(new SkywarsGameListener());
        getGameListener().registerListener(new AssassinationListener());
        getGameListener().registerListener(new SurvivalGamesListener());
        getGameListener().registerListener(new DuelsListener());
    }

    @Override
    public String getName() {
        return "CubeCraft Games";
    }

    @Override
    public String getConfigName() {
        return "cubecraft";
    }

    @Override
    public boolean handleServer(String host, int port) {
        return host.equals("play.cubecraftgames.net") || host.equals("play.cubecraft.net");
    }

}
