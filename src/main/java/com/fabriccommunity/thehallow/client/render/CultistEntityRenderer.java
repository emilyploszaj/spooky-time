package com.fabriccommunity.thehallow.client.render;

import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.util.Identifier;

import com.fabriccommunity.thehallow.TheHallow;
import com.fabriccommunity.thehallow.client.model.CultistModel;
import com.fabriccommunity.thehallow.entity.CultistEntity;

public class CultistEntityRenderer extends BipedEntityRenderer<CultistEntity, CultistModel> {
	private static final Identifier SKIN = TheHallow.id("textures/entity/cultist.png");
	
	public CultistEntityRenderer(EntityRenderDispatcher erd) {
		super(erd, new CultistModel(), 0.5F);
	}
	
	protected Identifier method_3982(CultistEntity entity) {
		return SKIN;
	}
}
