package com.rafamv.bygoneage.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import thehippomaster.AnimationAPI.IAnimatedEntity;
import thehippomaster.AnimationAPI.client.Animator;

import com.rafamv.bygoneage.client.renderer.ResettableModelRenderer;
import com.rafamv.bygoneage.entity.EntityBygoneAgeCreature;
import com.rafamv.bygoneage.enums.BygoneAgeAnimationIDs;

public class ModelMammoth extends ModelBase {

	private Animator animator;
	public static final float PI = (float) Math.PI;
	ResettableModelRenderer tail1, tail2, tailEnd1, tailEnd2, body1, body2, body3, head, trunk1, trunk2, trunk3, trunk4, rightBackFoot, leftBackFoot, rightFrontFoot, leftFrontFoot, leftBackLeg1, rightBackLeg1, leftBackLeg2, rightbackLeg2, leftFrontLeg1, rightFrontLeg1, leftFrontLeg2,
			rightFrontLeg2, earLeft, earRight, headTop, leftTusk1, rightTusk1, leftTusk2, rightTusk2, rightTusk3, leftTusk3;

	public ModelMammoth() {
		animator = new Animator(this);
		textureWidth = 512;
		textureHeight = 256;

		tail1 = new ResettableModelRenderer(this, 314, 0);
		tail1.addBox(0F, 0F, 0F, 2, 12, 2);
		tail1.setRotationPoint(0F, -16F, 26F);
		tail1.setTextureSize(512, 256);
		tail1.mirror = true;
		setRotation(tail1, 0.2617994F, 0F, 0F);
		tail2 = new ResettableModelRenderer(this, 314, 14);
		tail2.addBox(0F, 11.4F, 2F, 2, 8, 2);
		tail2.setRotationPoint(0F, -16F, 26F);
		tail2.setTextureSize(512, 256);
		tail2.mirror = true;
		setRotation(tail2, 0.0872665F, 0F, 0F);
		tailEnd1 = new ResettableModelRenderer(this, 314, 24);
		tailEnd1.addBox(-5F, 17F, 1F, 4, 8, 0);
		tailEnd1.setRotationPoint(0F, -16F, 26F);
		tailEnd1.setTextureSize(512, 256);
		tailEnd1.mirror = true;
		setRotation(tailEnd1, 0F, 1.570796F, 0.0872665F);
		tailEnd2 = new ResettableModelRenderer(this, 314, 24);
		tailEnd2.addBox(-1F, 17F, 3.2F, 4, 8, 0);
		tailEnd2.setRotationPoint(0F, -16F, 26F);
		tailEnd2.setTextureSize(512, 256);
		tailEnd2.mirror = true;
		setRotation(tailEnd2, 0.0872665F, 0F, 0F);
		body1 = new ResettableModelRenderer(this, 0, 0);
		body1.addBox(-14F, -8F, 0F, 28, 32, 25);
		body1.setRotationPoint(0F, -16F, -28F);
		body1.setTextureSize(512, 256);
		body1.mirror = true;
		setRotation(body1, 0F, 0F, 0F);
		body2 = new ResettableModelRenderer(this, 106, 0);
		body2.addBox(-16F, -8F, 0F, 32, 32, 24);
		body2.setRotationPoint(0F, -16F, -8F);
		body2.setTextureSize(512, 256);
		body2.mirror = true;
		setRotation(body2, -0.2617994F, 0F, 0F);
		body3 = new ResettableModelRenderer(this, 218, 0);
		body3.addBox(-14F, -4F, -8F, 28, 32, 20);
		body3.setRotationPoint(0F, -16F, 16F);
		body3.setTextureSize(512, 256);
		body3.mirror = true;
		setRotation(body3, 0F, 0F, 0F);
		head = new ResettableModelRenderer(this, 0, 57);
		head.addBox(-9F, -6F, -16F, 18, 21, 18);
		head.setRotationPoint(0F, -20F, -28F);
		head.setTextureSize(512, 256);
		head.mirror = true;
		setRotation(head, -0.0872665F, 0F, 0F);
		trunk1 = new ResettableModelRenderer(this, 0, 113);
		trunk1.addBox(-5.5F, 7.2F, -14.5F, 11, 12, 7);
		trunk1.setRotationPoint(0F, -20F, -28F);
		trunk1.setTextureSize(512, 256);
		trunk1.mirror = true;
		setRotation(trunk1, -0.3490659F, 0F, 0F);
		trunk2 = new ResettableModelRenderer(this, 0, 132);
		trunk2.addBox(-4.5F, 14.9F, -19F, 9, 8, 7);
		trunk2.setRotationPoint(0F, -20F, -28F);
		trunk2.setTextureSize(512, 256);
		trunk2.mirror = true;
		setRotation(trunk2, -0.0872665F, 0F, 0F);
		trunk3 = new ResettableModelRenderer(this, 0, 147);
		trunk3.addBox(-4F, 22F, -18.5F, 8, 9, 6);
		trunk3.setRotationPoint(0F, -20F, -28F);
		trunk3.setTextureSize(512, 256);
		trunk3.mirror = true;
		setRotation(trunk3, -0.0872665F, 0F, 0F);
		trunk4 = new ResettableModelRenderer(this, 0, 162);
		trunk4.addBox(-3.5F, 29.2F, -20.5F, 7, 9, 5);
		trunk4.setRotationPoint(0F, -20F, -28F);
		trunk4.setTextureSize(512, 256);
		trunk4.mirror = true;
		setRotation(trunk4, 0F, 0F, 0F);
		rightBackFoot = new ResettableModelRenderer(this, 295, 134);
		rightBackFoot.addBox(-2.5F, 21F, 4.8F, 9, 11, 10);
		rightBackFoot.setRotationPoint(-14F, -8F, 12F);
		rightBackFoot.setTextureSize(512, 256);
		rightBackFoot.mirror = true;
		setRotation(rightBackFoot, 0F, 0F, 0F);
		leftBackFoot = new ResettableModelRenderer(this, 225, 134);
		leftBackFoot.addBox(-6.5F, 21F, 4.8F, 9, 11, 10);
		leftBackFoot.setRotationPoint(14F, -8F, 12F);
		leftBackFoot.setTextureSize(512, 256);
		leftBackFoot.mirror = true;
		setRotation(leftBackFoot, 0F, 0F, 0F);
		rightFrontFoot = new ResettableModelRenderer(this, 150, 128);
		rightFrontFoot.addBox(-4.5F, 23F, -4F, 9, 11, 10);
		rightFrontFoot.setRotationPoint(-12F, -10F, -21F);
		rightFrontFoot.setTextureSize(512, 256);
		rightFrontFoot.mirror = true;
		setRotation(rightFrontFoot, 0F, 0F, 0F);
		leftFrontFoot = new ResettableModelRenderer(this, 75, 128);
		leftFrontFoot.addBox(-2.5F, 23F, -4F, 9, 11, 10);
		leftFrontFoot.setRotationPoint(12F, -10F, -21F);
		leftFrontFoot.setTextureSize(512, 256);
		leftFrontFoot.mirror = true;
		setRotation(leftFrontFoot, 0F, 0F, 0F);
		leftBackLeg1 = new ResettableModelRenderer(this, 225, 60);
		leftBackLeg1.addBox(-8F, -10F, -5F, 12, 24, 18);
		leftBackLeg1.setRotationPoint(14F, -8F, 12F);
		leftBackLeg1.setTextureSize(512, 256);
		leftBackLeg1.mirror = true;
		setRotation(leftBackLeg1, 0F, 0F, 0F);
		rightBackLeg1 = new ResettableModelRenderer(this, 295, 60);
		rightBackLeg1.addBox(-4F, -10F, -5F, 12, 24, 18);
		rightBackLeg1.setRotationPoint(-14F, -8F, 12F);
		rightBackLeg1.setTextureSize(512, 256);
		rightBackLeg1.mirror = true;
		setRotation(rightBackLeg1, 0F, 0F, 0F);
		leftBackLeg2 = new ResettableModelRenderer(this, 225, 102);
		leftBackLeg2.addBox(-7F, 4F, -8F, 10, 22, 10);
		leftBackLeg2.setRotationPoint(14F, -8F, 12F);
		leftBackLeg2.setTextureSize(512, 256);
		leftBackLeg2.mirror = true;
		setRotation(leftBackLeg2, 0.5235988F, 0F, 0F);
		rightbackLeg2 = new ResettableModelRenderer(this, 295, 102);
		rightbackLeg2.addBox(-3F, 4F, -8F, 10, 22, 10);
		rightbackLeg2.setRotationPoint(-14F, -8F, 12F);
		rightbackLeg2.setTextureSize(512, 256);
		rightbackLeg2.mirror = true;
		setRotation(rightbackLeg2, 0.5235988F, 0F, 0F);
		leftFrontLeg1 = new ResettableModelRenderer(this, 75, 60);
		leftFrontLeg1.addBox(-8F, -10F, -5F, 16, 24, 18);
		leftFrontLeg1.setRotationPoint(12F, -10F, -21F);
		leftFrontLeg1.setTextureSize(512, 256);
		leftFrontLeg1.mirror = true;
		setRotation(leftFrontLeg1, 0F, 0F, 0F);
		rightFrontLeg1 = new ResettableModelRenderer(this, 150, 60);
		rightFrontLeg1.addBox(-8F, -10F, -5F, 16, 24, 18);
		rightFrontLeg1.setRotationPoint(-12F, -10F, -21F);
		rightFrontLeg1.setTextureSize(512, 256);
		rightFrontLeg1.mirror = true;
		setRotation(rightFrontLeg1, 0F, 0F, 0F);
		leftFrontLeg2 = new ResettableModelRenderer(this, 75, 102);
		leftFrontLeg2.addBox(-3F, 8F, 2F, 10, 16, 10);
		leftFrontLeg2.setRotationPoint(12F, -10F, -21F);
		leftFrontLeg2.setTextureSize(512, 256);
		leftFrontLeg2.mirror = true;
		setRotation(leftFrontLeg2, -0.2617994F, 0F, 0F);
		rightFrontLeg2 = new ResettableModelRenderer(this, 150, 102);
		rightFrontLeg2.addBox(-5F, 8F, 2F, 10, 16, 10);
		rightFrontLeg2.setRotationPoint(-12F, -10F, -21F);
		rightFrontLeg2.setTextureSize(512, 256);
		rightFrontLeg2.mirror = true;
		setRotation(rightFrontLeg2, -0.2617994F, 0F, 0F);
		earLeft = new ResettableModelRenderer(this, 50, 120);
		earLeft.addBox(6F, -3F, -8F, 7, 12, 1);
		earLeft.setRotationPoint(0F, -20F, -28F);
		earLeft.setTextureSize(512, 256);
		earLeft.mirror = true;
		setRotation(earLeft, 0F, -0.3490659F, 0F);
		earRight = new ResettableModelRenderer(this, 50, 140);
		earRight.addBox(-13F, -3F, -8F, 7, 12, 1);
		earRight.setRotationPoint(0F, -20F, -28F);
		earRight.setTextureSize(512, 256);
		earRight.mirror = true;
		setRotation(earRight, 0F, 0.3490659F, 0F);
		headTop = new ResettableModelRenderer(this, 0, 96);
		headTop.addBox(-7.5F, -9F, -15F, 15, 3, 14);
		headTop.setRotationPoint(0F, -20F, -28F);
		headTop.setTextureSize(512, 256);
		headTop.mirror = true;
		setRotation(headTop, -0.0872665F, 0F, 0F);
		leftTusk1 = new ResettableModelRenderer(this, 40, 115);
		leftTusk1.addBox(7.2F, 16F, -9F, 2, 16, 2);
		leftTusk1.setRotationPoint(0F, -20F, -28F);
		leftTusk1.setTextureSize(512, 256);
		leftTusk1.mirror = true;
		setRotation(leftTusk1, -0.6108652F, 0F, 0F);
		leftTusk2 = new ResettableModelRenderer(this, 40, 133);
		leftTusk2.addBox(7.2F, 24F, 20F, 2, 16, 2);
		leftTusk2.setRotationPoint(0F, -20F, -28F);
		leftTusk2.setTextureSize(512, 256);
		leftTusk2.mirror = true;
		setRotation(leftTusk2, -1.570796F, 0F, 0F);
		leftTusk3 = new ResettableModelRenderer(this, 40, 151);
		leftTusk3.addBox(7.2F, -8.5F, -45.5F, 2, 8, 2);
		leftTusk3.setRotationPoint(0F, -20F, -28F);
		leftTusk3.setTextureSize(512, 256);
		leftTusk3.mirror = true;
		setRotation(leftTusk3, 0.5235988F, 0F, 0F);
		rightTusk1 = new ResettableModelRenderer(this, 40, 115);
		rightTusk1.addBox(-9.2F, 16F, -9F, 2, 16, 2);
		rightTusk1.setRotationPoint(0F, -20F, -28F);
		rightTusk1.setTextureSize(512, 256);
		rightTusk1.mirror = true;
		setRotation(rightTusk1, -0.6108652F, 0F, 0F);
		rightTusk2 = new ResettableModelRenderer(this, 40, 133);
		rightTusk2.addBox(-9.2F, 24F, 20F, 2, 16, 2);
		rightTusk2.setRotationPoint(0F, -20F, -28F);
		rightTusk2.setTextureSize(512, 256);
		rightTusk2.mirror = true;
		setRotation(rightTusk2, -1.570796F, 0F, 0F);
		rightTusk3 = new ResettableModelRenderer(this, 40, 151);
		rightTusk3.addBox(-9.2F, -8.5F, -45.5F, 2, 8, 2);
		rightTusk3.setRotationPoint(0F, -20F, -28F);
		rightTusk3.setTextureSize(512, 256);
		rightTusk3.mirror = true;
		setRotation(rightTusk3, 0.5235988F, 0F, 0F);

		tail1.savefirstParameters();
		tail2.savefirstParameters();
		tailEnd1.savefirstParameters();
		tailEnd2.savefirstParameters();
		body1.savefirstParameters();
		body2.savefirstParameters();
		body3.savefirstParameters();
		head.savefirstParameters();
		trunk1.savefirstParameters();
		trunk2.savefirstParameters();
		trunk3.savefirstParameters();
		trunk4.savefirstParameters();
		rightBackFoot.savefirstParameters();
		leftBackFoot.savefirstParameters();
		rightFrontFoot.savefirstParameters();
		leftFrontFoot.savefirstParameters();
		leftBackLeg1.savefirstParameters();
		rightBackLeg1.savefirstParameters();
		leftBackLeg2.savefirstParameters();
		rightbackLeg2.savefirstParameters();
		leftFrontLeg1.savefirstParameters();
		rightFrontLeg1.savefirstParameters();
		leftFrontLeg2.savefirstParameters();
		rightFrontLeg2.savefirstParameters();
		earLeft.savefirstParameters();
		earRight.savefirstParameters();
		headTop.savefirstParameters();
		leftTusk1.savefirstParameters();
		rightTusk1.savefirstParameters();
		leftTusk2.savefirstParameters();
		rightTusk2.savefirstParameters();
		rightTusk3.savefirstParameters();
		leftTusk3.savefirstParameters();
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		animate(entity, f, f1, f2, f3, f4, f5);

		tail1.render(f5);
		tail2.render(f5);
		tailEnd1.render(f5);
		tailEnd2.render(f5);
		body1.render(f5);
		body2.render(f5);
		body3.render(f5);
		head.render(f5);
		trunk1.render(f5);
		trunk2.render(f5);
		trunk3.render(f5);
		trunk4.render(f5);
		rightBackFoot.render(f5);
		leftBackFoot.render(f5);
		rightFrontFoot.render(f5);
		leftFrontFoot.render(f5);
		leftBackLeg1.render(f5);
		rightBackLeg1.render(f5);
		leftBackLeg2.render(f5);
		rightbackLeg2.render(f5);
		leftFrontLeg1.render(f5);
		rightFrontLeg1.render(f5);
		leftFrontLeg2.render(f5);
		rightFrontLeg2.render(f5);
		earLeft.render(f5);
		earRight.render(f5);
		headTop.render(f5);
		if (((EntityBygoneAgeCreature) entity).isCreatureAdult()) {
			leftTusk1.render(f5);
			rightTusk1.render(f5);
			leftTusk2.render(f5);
			rightTusk2.render(f5);
			if (((EntityBygoneAgeCreature) entity).isMale()) {
				rightTusk3.render(f5);
				leftTusk3.render(f5);
			}
		} else if (((EntityBygoneAgeCreature) entity).isCreatureHalfAdult()) {
			leftTusk1.render(f5);
			rightTusk1.render(f5);
		}
	}

	private void setRotation(ResettableModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		float headRotationX = f4 / (180F / this.PI);
		float headRotationY = f3 / (180F / this.PI);
		float naturalTrunkMovement = MathHelper.cos(0.05F * f2);
		float tailNaturalMovement = 0.05F * MathHelper.cos(0.1F * f2);
		float legsMovement1 = MathHelper.cos(f * 0.5F) * 1.0F * f1;
		float legsMovement2 = MathHelper.cos(f * 0.5F + this.PI) * 1.0F * f1;

		body1.rotateAngleX = body1.firstRotateAngleX;
		body2.rotateAngleX = body2.firstRotateAngleX;
		body3.rotateAngleX = body3.firstRotateAngleX;

		head.rotateAngleX = headRotationX;
		earLeft.rotateAngleX = headRotationX;
		earRight.rotateAngleX = headRotationX;
		headTop.rotateAngleX = headRotationX;
		leftTusk1.rotateAngleX = headRotationX + leftTusk1.firstRotateAngleX;
		leftTusk2.rotateAngleX = headRotationX + leftTusk2.firstRotateAngleX;
		leftTusk3.rotateAngleX = headRotationX + leftTusk3.firstRotateAngleX;
		rightTusk1.rotateAngleX = headRotationX + rightTusk1.firstRotateAngleX;
		rightTusk2.rotateAngleX = headRotationX + rightTusk2.firstRotateAngleX;
		rightTusk3.rotateAngleX = headRotationX + rightTusk3.firstRotateAngleX;
		trunk1.rotateAngleX = headRotationX + 0.02F * naturalTrunkMovement + trunk1.firstRotateAngleX;
		trunk2.rotateAngleX = headRotationX + 0.04F * naturalTrunkMovement + trunk2.firstRotateAngleX;
		trunk3.rotateAngleX = headRotationX + 0.06F * naturalTrunkMovement + trunk3.firstRotateAngleX;
		trunk4.rotateAngleX = headRotationX + 0.08F * naturalTrunkMovement + trunk4.firstRotateAngleX;

		head.rotateAngleY = headRotationY;
		earLeft.rotateAngleY = headRotationY;
		earRight.rotateAngleY = headRotationY;
		headTop.rotateAngleY = headRotationY;
		leftTusk1.rotateAngleY = headRotationY + leftTusk1.firstRotateAngleY;
		leftTusk2.rotateAngleY = headRotationY + leftTusk2.firstRotateAngleY;
		leftTusk3.rotateAngleY = headRotationY + leftTusk3.firstRotateAngleY;
		rightTusk1.rotateAngleY = headRotationY + rightTusk1.firstRotateAngleY;
		rightTusk2.rotateAngleY = headRotationY + rightTusk2.firstRotateAngleY;
		rightTusk3.rotateAngleY = headRotationY + rightTusk3.firstRotateAngleY;
		trunk1.rotateAngleY = headRotationY + trunk1.firstRotateAngleY;
		trunk2.rotateAngleY = headRotationY + trunk2.firstRotateAngleY;
		trunk3.rotateAngleY = headRotationY + trunk3.firstRotateAngleY;
		trunk4.rotateAngleY = headRotationY + trunk4.firstRotateAngleY;

		leftFrontLeg1.rotateAngleX = legsMovement2 + leftFrontLeg1.firstRotateAngleX;
		leftFrontLeg2.rotateAngleX = legsMovement2 + leftFrontLeg2.firstRotateAngleX;
		leftFrontFoot.rotateAngleX = legsMovement2 + leftFrontFoot.firstRotateAngleX;

		rightFrontLeg1.rotateAngleX = legsMovement1 + rightFrontLeg1.firstRotateAngleX;
		rightFrontLeg2.rotateAngleX = legsMovement1 + rightFrontLeg2.firstRotateAngleX;
		rightFrontFoot.rotateAngleX = legsMovement1 + rightFrontFoot.firstRotateAngleX;

		leftBackLeg1.rotateAngleX = legsMovement1 + leftBackLeg1.firstRotateAngleX;
		leftBackLeg2.rotateAngleX = legsMovement1 + leftBackLeg2.firstRotateAngleX;
		leftBackFoot.rotateAngleX = legsMovement1 + leftBackFoot.firstRotateAngleX;

		rightBackLeg1.rotateAngleX = legsMovement2 + rightBackLeg1.firstRotateAngleX;
		rightbackLeg2.rotateAngleX = legsMovement2 + rightbackLeg2.firstRotateAngleX;
		rightBackFoot.rotateAngleX = legsMovement2 + rightBackFoot.firstRotateAngleX;

		tail1.rotateAngleX = tailNaturalMovement + tail1.firstRotateAngleX;
		tail2.rotateAngleX = tailNaturalMovement + tail2.firstRotateAngleX;
		tailEnd1.rotateAngleX = tailNaturalMovement + tailEnd1.firstRotateAngleX;
		tailEnd2.rotateAngleX = tailNaturalMovement + tailEnd2.firstRotateAngleX;
		tail1.rotateAngleY = tailNaturalMovement + tail1.firstRotateAngleY;
		tail2.rotateAngleY = tailNaturalMovement + tail1.firstRotateAngleY;
		tailEnd1.rotateAngleY = tailNaturalMovement + tailEnd1.firstRotateAngleY;
		tailEnd2.rotateAngleY = tailNaturalMovement + tailEnd2.firstRotateAngleY;
		tail1.rotateAngleZ = tailNaturalMovement + tail1.firstRotateAngleZ;
		tail2.rotateAngleZ = tailNaturalMovement + tail2.firstRotateAngleZ;
		tailEnd1.rotateAngleZ = tailNaturalMovement + tailEnd1.firstRotateAngleZ;
		tailEnd2.rotateAngleZ = tailNaturalMovement + tailEnd2.firstRotateAngleZ;
	}

	public void animate(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animator.update((IAnimatedEntity) entity);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		animator.setAnim(BygoneAgeAnimationIDs.ANIMATION_HEADBUTT.getAnimationID());
		animator.startPhase(7);
		animator.rotate(head, PI / 3F, 0F, 0F);
		animator.rotate(headTop, PI / 3F, 0F, 0F);
		animator.rotate(earLeft, PI / 3F, 0F, 0F);
		animator.rotate(earRight, PI / 3F, 0F, 0F);
		animator.rotate(trunk1, PI / 3F, 0F, 0F);
		animator.rotate(trunk2, PI / 3F, 0F, 0F);
		animator.rotate(trunk3, PI / 3F, 0F, 0F);
		animator.rotate(trunk4, PI / 3F, 0F, 0F);
		animator.rotate(leftTusk1, PI / 3F, 0F, 0F);
		animator.rotate(rightTusk1, PI / 3F, 0F, 0F);
		animator.rotate(leftTusk2, PI / 3F, 0F, 0F);
		animator.rotate(rightTusk2, PI / 3F, 0F, 0F);
		animator.rotate(rightTusk3, PI / 3F, 0F, 0F);
		animator.rotate(leftTusk3, PI / 3F, 0F, 0F);
		animator.endPhase();
		animator.setStationaryPhase(3);
		animator.startPhase(3);
		animator.rotate(head, -PI / 2F, 0F, 0F);
		animator.rotate(headTop, -PI / 2F, 0F, 0F);
		animator.rotate(earLeft, -PI / 2F, 0F, 0F);
		animator.rotate(earRight, -PI / 2F, 0F, 0F);
		animator.rotate(trunk1, -PI / 2F, 0F, 0F);
		animator.rotate(trunk2, -PI / 2F, 0F, 0F);
		animator.rotate(trunk3, -PI / 2F, 0F, 0F);
		animator.rotate(trunk4, -PI / 2F, 0F, 0F);
		animator.rotate(leftTusk1, -PI / 2F, 0F, 0F);
		animator.rotate(rightTusk1, -PI / 2F, 0F, 0F);
		animator.rotate(leftTusk2, -PI / 2F, 0F, 0F);
		animator.rotate(rightTusk2, -PI / 2F, 0F, 0F);
		animator.rotate(rightTusk3, -PI / 2F, 0F, 0F);
		animator.rotate(leftTusk3, -PI / 2F, 0F, 0F);
		animator.endPhase();
		animator.resetPhase(2);
	}

}