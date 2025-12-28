package net.bte.mod.packet;

import org.mtr.mapping.registry.PacketHandler;
import org.mtr.mapping.tool.PacketBufferReceiver;
import org.mtr.mapping.tool.PacketBufferSender;
import org.mtr.mod.packet.ClientPacketHelper;

public final class PacketOpenPlatformSettingScreen extends PacketHandler {

    private final int balance;

    public PacketOpenPlatformSettingScreen(PacketBufferReceiver packetBufferReceiver) {
        balance = packetBufferReceiver.readInt();
    }

    public PacketOpenPlatformSettingScreen(int balance) {
        this.balance = balance;
    }

    @Override
    public void write(PacketBufferSender packetBufferSender) {
        packetBufferSender.writeInt(balance);
    }

    @Override
    public void runClient() {
        ClientPacketHelper.openTicketMachineScreen(balance);
    }
}