package net.wurstclient.commands;

import net.minecraft.text.Text;
import net.wurstclient.command.CmdException;
import net.wurstclient.command.Command;

public final class TestCmd extends Command {

    public TestCmd()
    {
        super("Test", "TestDesc",
                "Test Syntax");
    }

    @Override
    public void call(String[] args) throws CmdException {
        MC.player.sendMessage(Text.of("Test"), false);
    }
}
