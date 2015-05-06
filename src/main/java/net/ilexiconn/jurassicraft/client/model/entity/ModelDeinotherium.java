package net.ilexiconn.jurassicraft.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeinotherium extends ModelBase
{
    ModelRenderer Trunk_1;
    ModelRenderer Trunk_2;
    ModelRenderer Trunk_3;
    ModelRenderer Trunk_4;
    ModelRenderer Trunk_5;
    ModelRenderer Trunk_6;
    ModelRenderer Lower_Jaw_1;
    ModelRenderer Lower_Jaw_2;
    ModelRenderer Left_Tusk_1;
    ModelRenderer Left_Tusk_2;
    ModelRenderer Right_Tusk_1;
    ModelRenderer Right_Tusk_2;
    ModelRenderer Head_1;
    ModelRenderer Head_2;
    ModelRenderer Left_Ear;
    ModelRenderer Right_Ear;
    ModelRenderer Neck;
    ModelRenderer Body_1;
    ModelRenderer Front_Left_Leg_1;
    ModelRenderer Front_Left_Leg_2;
    ModelRenderer Front_Left_Leg_3;
    ModelRenderer Front_Left_Foot;
    ModelRenderer Front_Right_Leg_1;
    ModelRenderer Front_Right_Leg_2;
    ModelRenderer Front_Right_Leg_3;
    ModelRenderer Front_Right_Foot;
    ModelRenderer Body_2;
    ModelRenderer Back_Left_Leg_1;
    ModelRenderer Back_Right_Leg_1;
    ModelRenderer Back_Left_Leg_2;
    ModelRenderer Back_Right_Leg_2;
    ModelRenderer Back_Right_Foot_;
    ModelRenderer Back_Left_Foot;
    ModelRenderer Tail;

    public ModelDeinotherium()
    {
        textureWidth = 256;
        textureHeight = 256;

        Trunk_1 = new ModelRenderer(this, 18, 66);
        Trunk_1.addBox(-1.5F, 0F, 0F, 3, 5, 4);
        Trunk_1.setRotationPoint(0F, -11.8F, -39.7F);
        Trunk_1.setTextureSize(256, 256);
        Trunk_1.mirror = true;
        setRotation(Trunk_1, -0.0371786F, 0F, 0F);
        Trunk_2 = new ModelRenderer(this, 121, 53);
        Trunk_2.addBox(-2.5F, 0F, 0F, 5, 7, 5);
        Trunk_2.setRotationPoint(0F, -17.8F, -41F);
        Trunk_2.setTextureSize(256, 256);
        Trunk_2.mirror = true;
        setRotation(Trunk_2, 0.1047198F, 0F, 0F);
        Trunk_3 = new ModelRenderer(this, 81, 72);
        Trunk_3.addBox(-3F, 0F, 0F, 6, 7, 6);
        Trunk_3.setRotationPoint(0F, -24.4F, -40.7F);
        Trunk_3.setTextureSize(256, 256);
        Trunk_3.mirror = true;
        setRotation(Trunk_3, -0.1047198F, 0F, 0F);
        Trunk_4 = new ModelRenderer(this, 191, 25);
        Trunk_4.addBox(-4F, 0F, -9F, 8, 8, 9);
        Trunk_4.setRotationPoint(0F, -32.8F, -37.5F);
        Trunk_4.setTextureSize(256, 256);
        Trunk_4.mirror = true;
        setRotation(Trunk_4, 1.099557F, 0F, 0F);
        Trunk_5 = new ModelRenderer(this, 125, 31);
        Trunk_5.addBox(-5F, 0F, -7F, 10, 11, 7);
        Trunk_5.setRotationPoint(0F, -36.3F, -32.5F);
        Trunk_5.setTextureSize(256, 256);
        Trunk_5.mirror = true;
        setRotation(Trunk_5, 0.5235988F, 0F, 0F);
        Trunk_6 = new ModelRenderer(this, 191, 0);
        Trunk_6.addBox(-6F, 0F, -9F, 12, 15, 9);
        Trunk_6.setRotationPoint(0F, -40.3F, -24.5F);
        Trunk_6.setTextureSize(256, 256);
        Trunk_6.mirror = true;
        setRotation(Trunk_6, 0.2094395F, 0F, 0F);
        Lower_Jaw_1 = new ModelRenderer(this, 1, 80);
        Lower_Jaw_1.addBox(-4.5F, 0F, 0F, 9, 6, 3);
        Lower_Jaw_1.setRotationPoint(0F, -24F, -27F);
        Lower_Jaw_1.setTextureSize(256, 256);
        Lower_Jaw_1.mirror = true;
        setRotation(Lower_Jaw_1, 0F, 0F, 0F);
        Lower_Jaw_2 = new ModelRenderer(this, 35, 68);
        Lower_Jaw_2.addBox(-5F, 0F, -12F, 10, 5, 12);
        Lower_Jaw_2.setRotationPoint(0F, -26.8F, -15F);
        Lower_Jaw_2.setTextureSize(256, 256);
        Lower_Jaw_2.mirror = true;
        setRotation(Lower_Jaw_2, 0.2356194F, 0F, 0F);
        Left_Tusk_1 = new ModelRenderer(this, 0, 71);
        Left_Tusk_1.addBox(-1F, 0F, -5F, 2, 2, 5);
        Left_Tusk_1.setRotationPoint(2.5F, -18.8F, -26.7F);
        Left_Tusk_1.setTextureSize(256, 256);
        Left_Tusk_1.mirror = true;
        setRotation(Left_Tusk_1, 1.919862F, 0F, 0F);
        Left_Tusk_2 = new ModelRenderer(this, 42, 134);
        Left_Tusk_2.addBox(-1F, 0F, -5F, 2, 2, 5);
        Left_Tusk_2.setRotationPoint(2.5F, -14.8F, -25.3F);
        Left_Tusk_2.setTextureSize(256, 256);
        Left_Tusk_2.mirror = true;
        setRotation(Left_Tusk_2, 2.076942F, 0F, 0F);
        Right_Tusk_1 = new ModelRenderer(this, 0, 71);
        Right_Tusk_1.addBox(-1F, 0F, -5F, 2, 2, 5);
        Right_Tusk_1.setRotationPoint(-2.5F, -18.8F, -26.7F);
        Right_Tusk_1.setTextureSize(256, 256);
        Right_Tusk_1.mirror = true;
        setRotation(Right_Tusk_1, 1.919862F, 0F, 0F);
        Right_Tusk_2 = new ModelRenderer(this, 42, 134);
        Right_Tusk_2.addBox(-1F, 0F, -5F, 2, 2, 5);
        Right_Tusk_2.setRotationPoint(-2.5F, -14.8F, -25.3F);
        Right_Tusk_2.setTextureSize(256, 256);
        Right_Tusk_2.mirror = true;
        setRotation(Right_Tusk_2, 2.076942F, 0F, 0F);
        Head_1 = new ModelRenderer(this, 141, 0);
        Head_1.addBox(-7F, 0F, -10F, 14, 18, 10);
        Head_1.setRotationPoint(0F, -42.8F, -15F);
        Head_1.setTextureSize(256, 256);
        Head_1.mirror = true;
        setRotation(Head_1, 0.1047198F, 0F, 0F);
        Head_2 = new ModelRenderer(this, 159, 64);
        Head_2.addBox(-8F, 0F, -13F, 16, 21, 13);
        Head_2.setRotationPoint(0F, -42.8F, -2F);
        Head_2.setTextureSize(256, 256);
        Head_2.mirror = true;
        setRotation(Head_2, 0F, 0F, 0F);
        Left_Ear = new ModelRenderer(this, 105, 87);
        Left_Ear.addBox(-1F, 0F, 0F, 1, 12, 10);
        Left_Ear.setRotationPoint(6.2F, -40.3F, -12F);
        Left_Ear.setTextureSize(256, 256);
        Left_Ear.mirror = true;
        setRotation(Left_Ear, 0.2094395F, 0.6108652F, 0F);
        Right_Ear = new ModelRenderer(this, 128, 67);
        Right_Ear.addBox(0F, 0F, 0F, 1, 12, 10);
        Right_Ear.setRotationPoint(-6.2F, -40.3F, -12F);
        Right_Ear.setTextureSize(256, 256);
        Right_Ear.mirror = true;
        setRotation(Right_Ear, 0.2094395F, -0.6108652F, 0F);
        Neck = new ModelRenderer(this, 0, 215);
        Neck.addBox(-9.5F, 0F, -6F, 19, 26, 6);
        Neck.setRotationPoint(0F, -42.8F, 4F);
        Neck.setTextureSize(256, 256);
        Neck.mirror = true;
        setRotation(Neck, 0F, 0F, 0F);
        Body_1 = new ModelRenderer(this, 0, 0);
        Body_1.addBox(-11.5F, 0F, 0F, 23, 37, 27);
        Body_1.setRotationPoint(0F, -42.8F, 3F);
        Body_1.setTextureSize(256, 256);
        Body_1.mirror = true;
        setRotation(Body_1, -0.1047198F, 0F, 0F);
        Front_Left_Leg_1 = new ModelRenderer(this, 0, 92);
        Front_Left_Leg_1.addBox(0F, 0F, 0F, 7, 18, 13);
        Front_Left_Leg_1.setRotationPoint(11F, -26.8F, 4F);
        Front_Left_Leg_1.setTextureSize(256, 256);
        Front_Left_Leg_1.mirror = true;
        setRotation(Front_Left_Leg_1, -0.0523599F, 0F, 0F);
        Front_Left_Leg_2 = new ModelRenderer(this, 0, 128);
        Front_Left_Leg_2.addBox(-4.5F, 0F, 0F, 9, 15, 11);
        Front_Left_Leg_2.setRotationPoint(12F, -9.3F, 3.7F);
        Front_Left_Leg_2.setTextureSize(256, 256);
        Front_Left_Leg_2.mirror = true;
        setRotation(Front_Left_Leg_2, 0.2094395F, 0F, 0F);
        Front_Left_Leg_3 = new ModelRenderer(this, 0, 160);
        Front_Left_Leg_3.addBox(-3.5F, 0F, -9F, 7, 14, 9);
        Front_Left_Leg_3.setRotationPoint(12F, 3.2F, 17F);
        Front_Left_Leg_3.setTextureSize(256, 256);
        Front_Left_Leg_3.mirror = true;
        setRotation(Front_Left_Leg_3, -0.122173F, 0F, 0F);
        Front_Left_Foot = new ModelRenderer(this, 0, 192);
        Front_Left_Foot.addBox(-3.5F, 0F, 0F, 7, 8, 9);
        Front_Left_Foot.setRotationPoint(12F, 16F, 6.4F);
        Front_Left_Foot.setTextureSize(256, 256);
        Front_Left_Foot.mirror = true;
        setRotation(Front_Left_Foot, 0F, 0F, 0F);
        Front_Right_Leg_1 = new ModelRenderer(this, 0, 92);
        Front_Right_Leg_1.addBox(-7F, 0F, 0F, 7, 18, 13);
        Front_Right_Leg_1.setRotationPoint(-11F, -26.8F, 4F);
        Front_Right_Leg_1.setTextureSize(256, 256);
        Front_Right_Leg_1.mirror = true;
        setRotation(Front_Right_Leg_1, -0.0523599F, 0F, 0F);
        Front_Right_Leg_2 = new ModelRenderer(this, 0, 128);
        Front_Right_Leg_2.addBox(-4.5F, 0F, 0F, 9, 15, 11);
        Front_Right_Leg_2.setRotationPoint(-12F, -9.3F, 3.7F);
        Front_Right_Leg_2.setTextureSize(256, 256);
        Front_Right_Leg_2.mirror = true;
        setRotation(Front_Right_Leg_2, 0.2094395F, 0F, 0F);
        Front_Right_Leg_3 = new ModelRenderer(this, 0, 160);
        Front_Right_Leg_3.addBox(-3.5F, 0F, -9F, 7, 14, 9);
        Front_Right_Leg_3.setRotationPoint(-12F, 3.2F, 17F);
        Front_Right_Leg_3.setTextureSize(256, 256);
        Front_Right_Leg_3.mirror = true;
        setRotation(Front_Right_Leg_3, -0.122173F, 0F, 0F);
        Front_Right_Foot = new ModelRenderer(this, 0, 192);
        Front_Right_Foot.addBox(-3.5F, 0F, 0F, 7, 8, 9);
        Front_Right_Foot.setRotationPoint(-12F, 16F, 6.4F);
        Front_Right_Foot.setTextureSize(256, 256);
        Front_Right_Foot.mirror = true;
        setRotation(Front_Right_Foot, 0F, 0F, 0F);
        Body_2 = new ModelRenderer(this, 130, 103);
        Body_2.addBox(-10F, 0F, 0F, 20, 35, 32);
        Body_2.setRotationPoint(0F, -38.3F, 26.8F);
        Body_2.setTextureSize(256, 256);
        Body_2.mirror = true;
        setRotation(Body_2, -0.1638957F, 0F, 0F);
        Back_Left_Leg_1 = new ModelRenderer(this, 55, 93);
        Back_Left_Leg_1.addBox(0F, 0F, 0F, 9, 24, 14);
        Back_Left_Leg_1.setRotationPoint(6.5F, -22.8F, 40F);
        Back_Left_Leg_1.setTextureSize(256, 256);
        Back_Left_Leg_1.mirror = true;
        setRotation(Back_Left_Leg_1, -0.1745329F, 0F, 0F);
        Back_Right_Leg_1 = new ModelRenderer(this, 55, 92);
        Back_Right_Leg_1.addBox(-9F, 0F, 0F, 9, 24, 14);
        Back_Right_Leg_1.setRotationPoint(-6.5F, -22.8F, 40F);
        Back_Right_Leg_1.setTextureSize(256, 256);
        Back_Right_Leg_1.mirror = true;
        setRotation(Back_Right_Leg_1, -0.1745329F, 0F, 0F);
        Back_Left_Leg_2 = new ModelRenderer(this, 38, 160);
        Back_Left_Leg_2.addBox(-3.5F, 0F, 0F, 7, 14, 10);
        Back_Left_Leg_2.setRotationPoint(11F, 1.2F, 37.5F);
        Back_Left_Leg_2.setTextureSize(256, 256);
        Back_Left_Leg_2.mirror = true;
        setRotation(Back_Left_Leg_2, 0.1919862F, 0F, 0F);
        Back_Right_Leg_2 = new ModelRenderer(this, 38, 160);
        Back_Right_Leg_2.addBox(-3.5F, 0F, 0F, 7, 14, 10);
        Back_Right_Leg_2.setRotationPoint(-11F, 1.2F, 37.5F);
        Back_Right_Leg_2.setTextureSize(256, 256);
        Back_Right_Leg_2.mirror = true;
        setRotation(Back_Right_Leg_2, 0.1919862F, 0F, 0F);
        Back_Right_Foot_ = new ModelRenderer(this, 38, 192);
        Back_Right_Foot_.addBox(-3.5F, 0F, -10F, 7, 11, 10);
        Back_Right_Foot_.setRotationPoint(-11F, 13F, 50F);
        Back_Right_Foot_.setTextureSize(256, 256);
        Back_Right_Foot_.mirror = true;
        setRotation(Back_Right_Foot_, 0F, 0F, 0F);
        Back_Left_Foot = new ModelRenderer(this, 38, 192);
        Back_Left_Foot.addBox(-3.5F, 0F, -10F, 7, 11, 10);
        Back_Left_Foot.setRotationPoint(11F, 13F, 50F);
        Back_Left_Foot.setTextureSize(256, 256);
        Back_Left_Foot.mirror = true;
        setRotation(Back_Left_Foot, 0F, 0F, 0F);
        Tail = new ModelRenderer(this, 78, 133);
        Tail.addBox(-1F, 0F, 0F, 2, 2, 14);
        Tail.setRotationPoint(0F, -26F, 58F);
        Tail.setTextureSize(256, 256);
        Tail.mirror = true;
        setRotation(Tail, -1.256637F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Trunk_1.render(f5);
        Trunk_2.render(f5);
        Trunk_3.render(f5);
        Trunk_4.render(f5);
        Trunk_5.render(f5);
        Trunk_6.render(f5);
        Lower_Jaw_1.render(f5);
        Lower_Jaw_2.render(f5);
        Left_Tusk_1.render(f5);
        Left_Tusk_2.render(f5);
        Right_Tusk_1.render(f5);
        Right_Tusk_2.render(f5);
        Head_1.render(f5);
        Head_2.render(f5);
        Left_Ear.render(f5);
        Right_Ear.render(f5);
        Neck.render(f5);
        Body_1.render(f5);
        Front_Left_Leg_1.render(f5);
        Front_Left_Leg_2.render(f5);
        Front_Left_Leg_3.render(f5);
        Front_Left_Foot.render(f5);
        Front_Right_Leg_1.render(f5);
        Front_Right_Leg_2.render(f5);
        Front_Right_Leg_3.render(f5);
        Front_Right_Foot.render(f5);
        Body_2.render(f5);
        Back_Left_Leg_1.render(f5);
        Back_Right_Leg_1.render(f5);
        Back_Left_Leg_2.render(f5);
        Back_Right_Leg_2.render(f5);
        Back_Right_Foot_.render(f5);
        Back_Left_Foot.render(f5);
        Tail.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
