package de.melanx.presentstand.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import de.melanx.presentstand.block.presentStand.TileEntityPresentStand;

public class PacketRequestUpdatePresentStand implements IMessage {

	private BlockPos pos;
	private int dimension;

	public PacketRequestUpdatePresentStand(BlockPos pos, int dimension) {
		this.pos = pos;
		this.dimension = dimension;
	}

	public PacketRequestUpdatePresentStand(TileEntityPresentStand te) {
		this(te.getPos(), te.getWorld().provider.getDimension());
	}

	public PacketRequestUpdatePresentStand() {
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeLong(pos.toLong());
		buf.writeInt(dimension);
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		pos = BlockPos.fromLong(buf.readLong());
		dimension = buf.readInt();
	}

	public static class Handler implements IMessageHandler<PacketRequestUpdatePresentStand, PacketUpdatePresentStand> {

		@Override
		public PacketUpdatePresentStand onMessage(PacketRequestUpdatePresentStand message, MessageContext ctx) {
			World world = FMLCommonHandler.instance().getMinecraftServerInstance().getWorld(message.dimension);
			TileEntityPresentStand te = (TileEntityPresentStand)world.getTileEntity(message.pos);
			if (te != null) {
				return new PacketUpdatePresentStand(te);
			} else {
				return null;
			}
		}

	}

}