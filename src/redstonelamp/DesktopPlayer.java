package redstonelamp;

import org.apache.mina.core.session.IoSession;
import redstonelamp.entity.Entity;
import redstonelamp.network.packet.DataPacket;
import redstonelamp.network.packet.TextPacket;
import redstonelamp.network.pc.PCInterface;

import java.net.InetSocketAddress;
import java.util.UUID;

/**
 * Implementation of a player, connected from a computer.
 */
public class DesktopPlayer extends Entity implements Player{
	private String displayName = "Steve"; //TODO: Remove init when ready
    private IoSession ioSession;
    private Server server;
    private PCInterface pcInterface;

    public DesktopPlayer(PCInterface pcInterface, Server server, IoSession session){
        this.pcInterface = pcInterface;
        this.server = server;
        this.ioSession = session;
    }

    @Override
    public void handleDataPacket(DataPacket packet) {

    }

    @Override
    public void sendDataPacket(DataPacket packet) {

    }

    @Override
    public void sendDirectDataPacket(DataPacket packet) {

    }

    @Override
    public boolean kick(String reason, boolean admin) {
        return false;
    }

    @Override
    public void close(String message, String reason, boolean notifyClient) {

    }

    @Override
    public String getIdentifier() {
        return null;
    }

    @Override
    public InetSocketAddress getAddress() {
        return null;
    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public boolean isLoggedIn() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getSkin() {
        return null;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public void sendMessage(String message) {

    }
    
    @Override
    public void sendPopup(String message) {
    	
    }
    
    @Override
    public void sendTip(String message) {
    	
    }

    @Override
    public boolean isOp() {
        return false;
    }

    public IoSession getSession(){
        return ioSession;
    }
    
	public String getDisplayName() {
		return displayName;
	}
	
	public void setDisplayName(String name) {
		displayName = name;
	}
}
