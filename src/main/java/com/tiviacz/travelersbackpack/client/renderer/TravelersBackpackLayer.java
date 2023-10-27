package com.tiviacz.travelersbackpack.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.tiviacz.travelersbackpack.util.RenderUtils;
import com.tiviacz.travelersbackpack.util.ResourceUtils;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.apache.commons.lang3.tuple.Triple;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;
import top.theillusivec4.curios.api.type.inventory.IDynamicStackHandler;



        if(container.getItemStack().getTag() != null)
        {
            if(container.getItemStack().getTag().contains("SleepingBagColor"))
            {
                isCustomSleepingBag = true;
            }
        }

        VertexConsumer vertexConsumer = bufferIn.getBuffer(flag ? RenderType.entityTranslucentCull(loc) : RenderType.entitySolid(loc));

        poseStack.pushPose();

        if(clientPlayer.isCrouching())
        {
            poseStack.translate(0D, -0.155D, 0.025D);
        }

        this.getParentModel().copyPropertiesTo(model);
        model.setupAngles(this.getParentModel());

        poseStack.translate(0, 0.175, 0.325);
        poseStack.scale(0.85F, 0.85F, 0.85F);

        if(isColorable)
        {
            Triple<Float, Float, Float> rgb = RenderUtils.intToRGB(BackpackDyeRecipe.getColor(container.getItemStack()));
            model.renderToBuffer(poseStack, vertexConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, rgb.getLeft(), rgb.getMiddle(), rgb.getRight(), 1.0F);

            loc = new ResourceLocation(TravelersBackpack.MODID, "textures/model/dyed_extras.png");
            vertexConsumer = bufferIn.getBuffer(RenderType.entityCutout(loc));
        }

        model.renderToBuffer(poseStack, vertexConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        if(isCustomSleepingBag)
        {
            loc = ResourceUtils.getSleepingBagTexture(container.getSleepingBagColor());
        }
        else
        {
            loc = ResourceUtils.getDefaultSleepingBagTexture();
        }

        vertexConsumer = bufferIn.getBuffer(RenderType.entityCutout(loc));
        model.renderToBuffer(poseStack, vertexConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 0.25F);

        poseStack.popPose();
    }
}
