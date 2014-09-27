package to.uk.ilexiconn.jurassicraft.animation;

import thehippomaster.AnimationAPI.AIAnimation;
import to.uk.ilexiconn.jurassicraft.entity.entity.EntityVelociraptor;

public class AIVelociraptorRoar extends AIAnimation
{
    private EntityVelociraptor entityRaptor;

    public AIVelociraptorRoar(EntityVelociraptor raptor)
    {
        super(raptor);
        entityRaptor = raptor;
    }

    public int getAnimID()
    {
        return 2;
    }

    public boolean isAutomatic()
    {
        return true;
    }

    public int getDuration()
    {
        return 20;
    }
}
