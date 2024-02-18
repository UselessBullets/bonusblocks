package luke.bonusblocks;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BonusRecipes {

    public void initilizeRecipes() {
        RecipeBuilderShaped templateLogtoPlank = new RecipeBuilderShaped(MOD_ID, "X");
        templateLogtoPlank.addInput('X', BonusBlocks.logMaple).create("logMapletoPlanks", new ItemStack(Block.planksOakPainted, 4, 14));
        templateLogtoPlank.addInput('X', BonusBlocks.logJacaranda).create("logJacarandatoPlanks", new ItemStack(Block.planksOakPainted, 4, 10));
        templateLogtoPlank.addInput('X', BonusBlocks.logScorched).create("logScorchedtoPlanks", new ItemStack(Block.planksOakPainted, 4, 15));
        templateLogtoPlank.addInput('X', BonusBlocks.logShrub).create("logShrubtoPlanks", new ItemStack(Block.planksOakPainted, 4, 8));
        templateLogtoPlank.addInput('X', BonusBlocks.logCacao).create("logCacaotoPlanks", new ItemStack(Block.planksOakPainted, 4, 5));

        RecipeBuilderShaped templateItemtoBlock = new RecipeBuilderShaped(MOD_ID, "XXX", "XXX", "XXX");
        templateItemtoBlock.addInput('X', Item.bone).create("block_of_bone", new ItemStack(BonusBlocks.blockBone, 1));
        templateItemtoBlock.addInput('X', Item.slimeball).create("block_of_slime", new ItemStack(BonusBlocks.blockSlime, 1));
        templateItemtoBlock.addInput('X', Item.sulphur).create("block_of_sulphur", new ItemStack(BonusBlocks.blockSulphur, 1));
        templateItemtoBlock.addInput('X', Item.dustSugar).create("block_of_sugar", new ItemStack(BonusBlocks.blockSugar, 1));
        templateItemtoBlock.addInput('X', Item.cloth).create("block_of_cloth", new ItemStack(BonusBlocks.blockCloth, 1));
        templateItemtoBlock.addInput('X', Item.ingotSteelCrude).create("block_of_crude_steel", new ItemStack(BonusBlocks.blockCrudeSteel, 1));
        templateItemtoBlock.addInput('X', Item.flint).create("block_of_flint", new ItemStack(BonusBlocks.blockFlint, 1));
        templateItemtoBlock.addInput('X', Item.oreRawGold).create("block_of_raw_gold", new ItemStack(BonusBlocks.blockRawGold, 1));
        templateItemtoBlock.addInput('X', Item.oreRawIron).create("block_of_raw_iron", new ItemStack(BonusBlocks.blockRawIron, 1));
        templateItemtoBlock.addInput('X', BonusItems.oreRawCopper).create("block_of_raw_copper", new ItemStack(BonusBlocks.blockRawCopper, 1));
        templateItemtoBlock.addInput('X', Item.leather).create("block_of_leather", new ItemStack(BonusBlocks.blockLeather, 1));

        RecipeBuilderShaped templateBlocktoItem = new RecipeBuilderShaped(MOD_ID, "X");
        templateBlocktoItem.addInput('X', BonusBlocks.blockBone).create("block_of_bone_to_bone", new ItemStack(Item.bone, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSlime).create("block_of_slime_to_slime", new ItemStack(Item.slimeball, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSulphur).create("block_of_sulphur_to_sulphur", new ItemStack(Item.sulphur, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSugar).create("block_of_sugar_to_sugar", new ItemStack(Item.dustSugar, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCloth).create("block_of_cloth_to_cloth", new ItemStack(Item.cloth, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCrudeSteel).create("block_of_crude_steel_to_crude_steel", new ItemStack(Item.ingotSteelCrude, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockFlint).create("block_of_flint_to_flint", new ItemStack(Item.flint, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawGold).create("block_of_raw_gold_to_raw_gold", new ItemStack(Item.oreRawGold, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawIron).create("block_of_raw_iron_to_raw_iron", new ItemStack(Item.oreRawIron, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawCopper).create("block_of_raw_copper_to_raw_copper", new ItemStack(BonusItems.oreRawCopper, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockLeather).create("block_of_leather_to_leather", new ItemStack(Item.leather, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCopper).create("block_of_copper_to_copper", new ItemStack(BonusItems.ingotCopper, 4));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Item.wheat)
                .addInput('S', Item.stick)
                .create("block_of_thatch", new ItemStack(BonusBlocks.thatch, 4));

        RecipeBuilder.Shaped(MOD_ID, "CCC", "C C", "CCC")
                .addInput('C', BonusItems.ingotCopper)
                .create("copper_mesh", new ItemStack(BonusBlocks.meshCopper, 8));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Item.wheat)
                .addInput('S', Item.leather)
                .create("block_of_wicker", new ItemStack(BonusBlocks.blockWicker, 4));

        RecipeBuilder.Shaped(MOD_ID, "GGG", "GGG")
                .addInput('G', BonusBlocks.glassObsidian)
                .create("glass_obsidian_trapdoor", new ItemStack(BonusBlocks.trapdoorGlassObsidian, 8));

        RecipeBuilder.Shaped(MOD_ID, "GQ", "QG")
                .addInput('G', Block.glass)
                .addInput('Q', Item.quartz)
                .create("glass_quartz", new ItemStack(BonusBlocks.glassQuartz, 4));

        RecipeBuilder.Shaped(MOD_ID, "CIC")
                .addInput('C', BonusBlocks.blockCopper)
                .addInput('I', BonusItems.ingotCopper)
                .create("copper_pipe", new ItemStack(BonusBlocks.pipeCopper, 8));
        RecipeBuilder.Shaped(MOD_ID, "C", "I", "C")
                .addInput('C', BonusBlocks.blockCopper)
                .addInput('I', BonusItems.ingotCopper)
                .create("copper_pipe", new ItemStack(BonusBlocks.pipeCopper, 8));

        RecipeBuilderShaped templateFlowertoDye = new RecipeBuilderShaped(MOD_ID, "X");
        templateFlowertoDye.addInput('X', BonusBlocks.flowerCyan).create("flower_cyan_to_dye", new ItemStack(Item.dye, 2, 6));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerPurple).create("flower_purple_to_dye", new ItemStack(Item.dye, 2, 5));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerPink).create("flower_pink_to_dye", new ItemStack(Item.dye, 2, 9));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerSilver).create("flower_silver_to_dye", new ItemStack(Item.dye, 2, 7));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerOrange).create("flower_orange_to_dye", new ItemStack(Item.dye, 2, 14));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerLightBlue).create("flower_lightblue_to_dye", new ItemStack(Item.dye, 2, 12));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerMagenta).create("flower_magenta_to_dye", new ItemStack(Item.dye, 2, 13));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerLime).create("flower_lime_to_dye", new ItemStack(Item.dye, 2, 10));
        templateFlowertoDye.addInput('X', BonusBlocks.mushroomGray).create("mushroom_gray_to_dye", new ItemStack(Item.dye, 2, 8));

        RecipeBuilderShaped templateMushroomToBlock = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateMushroomToBlock.addInput('X', Block.mushroomRed).create("red_mushroom_block", new ItemStack(BonusBlocks.fungusRed, 4));
        templateMushroomToBlock.addInput('X', Block.mushroomBrown).create("brown_mushroom_block", new ItemStack(BonusBlocks.fungusBrown, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.mushroomGray).create("gray_mushroom_block", new ItemStack(BonusBlocks.fungusGray, 4));

        templateMushroomToBlock.addInput('X', BonusItems.ingotCopper).create("block_of_copper", new ItemStack(BonusBlocks.blockCopper, 1));

        templateMushroomToBlock.addInput('X', Block.flowerRed).create("petal_red", new ItemStack(BonusBlocks.petalRed, 4));
        templateMushroomToBlock.addInput('X', Block.flowerYellow).create("petal_yellow", new ItemStack(BonusBlocks.petalYellow, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerCyan).create("petal_cyan", new ItemStack(BonusBlocks.petalCyan, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerPurple).create("petal_purple", new ItemStack(BonusBlocks.petalPurple, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerPink).create("petal_pink", new ItemStack(BonusBlocks.petalPink, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerSilver).create("petal_silver", new ItemStack(BonusBlocks.petalSilver, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerOrange).create("petal_orange", new ItemStack(BonusBlocks.petalOrange, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerLightBlue).create("petal_lightblue", new ItemStack(BonusBlocks.petalLightBlue, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerMagenta).create("petal_magenta", new ItemStack(BonusBlocks.petalMagenta, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerLime).create("petal_lime", new ItemStack(BonusBlocks.petalLime, 4));

        RecipeBuilderShaped templateFlowerBed = new RecipeBuilderShaped(MOD_ID, "XX");
        templateFlowerBed.addInput('X', BonusBlocks.petalRed).create("petal_red_to_layer", new ItemStack(BonusBlocks.petalLayerRed, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalYellow).create("petal_yellow_to_layer", new ItemStack(BonusBlocks.petalLayerYellow, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalCyan).create("petal_cyan_to_layer", new ItemStack(BonusBlocks.petalLayerCyan, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalPurple).create("petal_purple_to_layer", new ItemStack(BonusBlocks.petalLayerPurple, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalPink).create("petal_pink_to_layer", new ItemStack(BonusBlocks.petalLayerPink, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalSilver).create("petal_silver_to_layer", new ItemStack(BonusBlocks.petalLayerSilver, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalOrange).create("petal_orange_to_layer", new ItemStack(BonusBlocks.petalLayerOrange, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalLightBlue).create("petal_lightblue_to_layer", new ItemStack(BonusBlocks.petalLayerLightBlue, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalMagenta).create("petal_magenta_to_layer", new ItemStack(BonusBlocks.petalLayerMagenta, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalLime).create("petal_lime_to_layer", new ItemStack(BonusBlocks.petalLayerLime, 8));

        RecipeBuilderShaped templateBricks = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateBricks.addInput('X', BonusBlocks.netherrack).create("netherrack_bricks", new ItemStack(BonusBlocks.brickNetherrack, 4));
        templateBricks.addInput('X', BonusBlocks.clayBaked).create("clay_bricks", new ItemStack(Block.brickClay, 16));
        templateBricks.addInput('X', BonusBlocks.scorchedstone).create("scorched_bricks", new ItemStack(BonusBlocks.brickScorchedstone, 4));
        templateBricks.addInput('X', Block.mudBaked).create("mud_bricks", new ItemStack(BonusBlocks.brickMud, 4));
        templateBricks.addInput('X', Item.ingotSteel).create("steel_bricks", new ItemStack(BonusBlocks.brickSteel, 4));
        templateBricks.addInput('X', Item.quartz).create("quartz_bricks", new ItemStack(BonusBlocks.brickQuartz, 4));
        templateBricks.addInput('X', Item.olivine).create("olivine_bricks", new ItemStack(BonusBlocks.brickOlivine, 4));
        templateBricks.addInput('X', Block.soulsand).create("soulslate", new ItemStack(BonusBlocks.soulslate, 4));

        templateBricks.addInput('X', Block.dirtScorched).create("scorchedstone", new ItemStack(BonusBlocks.scorchedstone, 4));

        RecipeBuilderShaped templateOvergrown = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateOvergrown.addInput('X', Block.grass).create("overgrown_grass", new ItemStack(BonusBlocks.overgrownGrass, 2));
        templateOvergrown.addInput('X', Block.grassRetro).create("overgrown_grass_retro", new ItemStack(BonusBlocks.overgrownGrassRetro, 2));
        templateOvergrown.addInput('X', Block.grassScorched).create("overgrown_grass_scorched", new ItemStack(BonusBlocks.overgrownGrassScorched, 2));
        templateOvergrown.addInput('X', Block.pathDirt).create("overgrown_path", new ItemStack(BonusBlocks.overgrownPath, 2));

        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_pillar");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("green_dye_white_dye_to_lime_dye");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("pebbles_to_granite");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bed");

        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_basalt_to_olivine");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_stone_to_slate");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_granite_to_quartz");

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(new ItemStack(Item.dye, 1, 2))
                .addInput(new ItemStack(Item.dye, 1, 11))
                .create("green_dye_white_dye_to_lime_dye", new ItemStack(Item.dye, 2, 10));

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(BonusBlocks.pumiceDry)
                .addInput(Item.bucketLava)
                .create("molten_pumice", new ItemStack(BonusBlocks.pumiceWet, 1));

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(BonusBlocks.pumiceWet)
                .addInput(Item.bucketWater)
                .create("pumice", new ItemStack(BonusBlocks.pumiceDry, 1));

        RecipeBuilder.Shaped(MOD_ID, "PX", "XP")
                .addInput('P', (Item.ammoPebble))
                .addInput('X', (Item.quartz))
                .create("pebbles_to_granite", new ItemStack(Block.granite, 2));

        RecipeBuilder.Shaped(MOD_ID, "WWW", "PPP")
                .addInput('P',("minecraft:planks"))
                .addInput('W', ("minecraft:wools"))
                .create("bed", new ItemStack(Item.bed, 1));

//        RecipeBuilder.Shaped(MOD_ID, "WWW")
//                .addInput('W', (Item.cloth))
//                .create("sleepingbag", new ItemStack(BonusBlocks.bedrollItem, 1));

        RecipeBuilderShaped templatePillar = new RecipeBuilderShaped(MOD_ID, "X", "X", "X");
        templatePillar.addInput('X', Block.marble).create("marble_pillar", new ItemStack(Block.pillarMarble, 3));
        templatePillar.addInput('X', Block.slate).create("slate_pillar", new ItemStack(BonusBlocks.pillarSlate, 3));

        RecipeBuilder.Shaped(MOD_ID, "PI", "IP")
                .addInput('P', Item.ammoPebble)
                .addInput('I', Block.ice)
                .create("pebbles_to_permafrost", new ItemStack(Block.cobblePermafrost, 2));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP", "PPP")
                .addInput('P', Block.planksOak)
                .create("crate", new ItemStack(BonusBlocks.crate, 9));

        RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                .addInput('C', Block.chestPlanksOak)
                .create("box", new ItemStack(BonusBlocks.box, 8));

        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logMaple.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logShrub.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logJacaranda.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logCacao.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesOakMossy.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesMaple.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesJacaranda.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(BonusBlocks.netherrack.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:cobblestones").add(BonusBlocks.cobbleNetherrack.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrass.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrassRetro.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrassScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(Block.grassScorched.getDefaultStack());

        Registries.ITEM_GROUPS.register("bonusblocks:copper_ores", Registries.stackListOf(BonusBlocks.oreCopperStone, BonusBlocks.oreCopperBasalt, BonusBlocks.oreCopperGranite, BonusBlocks.oreCopperLimestone));

        Registries.ITEM_GROUPS.register("bonusblocks:silver_ores", Registries.stackListOf(BonusBlocks.oreSilverStone, BonusBlocks.oreSilverBasalt, BonusBlocks.oreSilverGranite, BonusBlocks.oreSilverLimestone));

        Registries.ITEM_GROUPS.register("bonusblocks:box", Registries.stackListOf(BonusBlocks.box, new ItemStack(BonusBlocks.boxPainted, 1, 0),
                new ItemStack(BonusBlocks.boxPainted, 1, 1),
                new ItemStack(BonusBlocks.boxPainted, 1, 2),
                new ItemStack(BonusBlocks.boxPainted, 1, 3),
                new ItemStack(BonusBlocks.boxPainted, 1, 4),
                new ItemStack(BonusBlocks.boxPainted, 1, 5),
                new ItemStack(BonusBlocks.boxPainted, 1, 6),
                new ItemStack(BonusBlocks.boxPainted, 1, 7),
                new ItemStack(BonusBlocks.boxPainted, 1, 8),
                new ItemStack(BonusBlocks.boxPainted, 1, 9),
                new ItemStack(BonusBlocks.boxPainted, 1, 10),
                new ItemStack(BonusBlocks.boxPainted, 1, 11),
                new ItemStack(BonusBlocks.boxPainted, 1, 12),
                new ItemStack(BonusBlocks.boxPainted, 1, 13),
                new ItemStack(BonusBlocks.boxPainted, 1, 14),
                new ItemStack(BonusBlocks.boxPainted, 1, 15)));

        Registries.ITEM_GROUPS.register("bonusblocks:wool_slab", Registries.stackListOf(new ItemStack(BonusBlocks.slabWool, 1, 0),
                new ItemStack(BonusBlocks.slabWool, 1, 16),
                new ItemStack(BonusBlocks.slabWool, 1, 32),
                new ItemStack(BonusBlocks.slabWool, 1, 48),
                new ItemStack(BonusBlocks.slabWool, 1, 64),
                new ItemStack(BonusBlocks.slabWool, 1, 80),
                new ItemStack(BonusBlocks.slabWool, 1, 96),
                new ItemStack(BonusBlocks.slabWool, 1, 112),
                new ItemStack(BonusBlocks.slabWool, 1, 128),
                new ItemStack(BonusBlocks.slabWool, 1, 144),
                new ItemStack(BonusBlocks.slabWool, 1, 160),
                new ItemStack(BonusBlocks.slabWool, 1, 176),
                new ItemStack(BonusBlocks.slabWool, 1, 192),
                new ItemStack(BonusBlocks.slabWool, 1, 208),
                new ItemStack(BonusBlocks.slabWool, 1, 224),
                new ItemStack(BonusBlocks.slabWool, 1, 240)));

        Registries.ITEM_GROUPS.register("bonusblocks:wool_stairs", Registries.stackListOf(new ItemStack(BonusBlocks.stairsWool, 1, 0),
                new ItemStack(BonusBlocks.stairsWool, 1, 16),
                new ItemStack(BonusBlocks.stairsWool, 1, 32),
                new ItemStack(BonusBlocks.stairsWool, 1, 48),
                new ItemStack(BonusBlocks.stairsWool, 1, 64),
                new ItemStack(BonusBlocks.stairsWool, 1, 80),
                new ItemStack(BonusBlocks.stairsWool, 1, 96),
                new ItemStack(BonusBlocks.stairsWool, 1, 112),
                new ItemStack(BonusBlocks.stairsWool, 1, 128),
                new ItemStack(BonusBlocks.stairsWool, 1, 144),
                new ItemStack(BonusBlocks.stairsWool, 1, 160),
                new ItemStack(BonusBlocks.stairsWool, 1, 176),
                new ItemStack(BonusBlocks.stairsWool, 1, 192),
                new ItemStack(BonusBlocks.stairsWool, 1, 208),
                new ItemStack(BonusBlocks.stairsWool, 1, 224),
                new ItemStack(BonusBlocks.stairsWool, 1, 240)));

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:box")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("painted_box_dye", new ItemStack(BonusBlocks.boxPainted, 1, color));

            RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                    .addInput('C', new ItemStack(Block.chestPlanksOakPainted, 1, color << 4))
                    .create("painted_box", new ItemStack(BonusBlocks.boxPainted, 8, color));
        }

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:wool_slab")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("wool_slab_dye", new ItemStack(BonusBlocks.slabWool, 1, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "CCC", "CCC")
                    .addInput('C', new ItemStack(Block.wool, 1, color))
                    .create("wool_slab", new ItemStack(BonusBlocks.slabWool, 6, color << 4));
        }
        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:wool_stairs")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("wool_stairs_dye", new ItemStack(BonusBlocks.stairsWool, 1, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "C  ", "CC ", "CCC")
                    .addInput('C', new ItemStack(Block.wool, 1, color))
                    .create("wool_stairs", new ItemStack(BonusBlocks.stairsWool, 6, color << 4));
        }

        RecipeBuilder.Shaped(MOD_ID, "PPP", "   ", "PPP")
                .addInput('P', ("minecraft:planks"))
                .create("empty_bookshelf", new ItemStack(BonusBlocks.bookshelfEmptyPlanksOak, 1));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP")
                .addInput('P', (Item.stick))
                .create("branches", new ItemStack(BonusBlocks.branch, 2));


        RecipeBuilderShaped templatePolished = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templatePolished.addInput('X', Block.marble).create("marble_polished", new ItemStack(BonusBlocks.marblePolished, 2));
        templatePolished.addInput('X', Block.permafrost).create("permafrost_polished", new ItemStack(BonusBlocks.permafrostPolished, 2));

        RecipeBuilderShaped templateCarvedSlab = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateCarvedSlab.addInput('X', Block.slabCapstoneMarble).create("marble_capstone_carved", new ItemStack(Block.capstoneMarble, 1));

        templateCarvedSlab.addInput('X', Block.slabBasaltPolished).create("basalt_carved", new ItemStack(Block.basaltCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabStonePolished).create("stone_carved", new ItemStack(Block.stoneCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabLimestonePolished).create("limestone_carved", new ItemStack(Block.limestoneCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabGranitePolished).create("granite_carved", new ItemStack(Block.graniteCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabMarblePolished).create("marble_carved", new ItemStack(BonusBlocks.marbleCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabSlatePolished).create("slate_carved", new ItemStack(BonusBlocks.slateCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabPermafrostPolished).create("permafrost_carved", new ItemStack(BonusBlocks.permafrostCarved, 1));

        RecipeBuilder.Shaped(MOD_ID, "S", "W")
                .addInput('S', (Item.string))
                .addInput('W', (BonusItems.soulwax))
                .create("soulwax_candle", new ItemStack(BonusItems.candleSoulwax, 2));

        RecipeBuilderShaped templateSlab = new RecipeBuilderShaped(MOD_ID, "XXX");
        templateSlab.addInput('X', Block.slatePolished).create("slate_polished_slab", new ItemStack(BonusBlocks.slabSlatePolished, 6));
        templateSlab.addInput('X', BonusBlocks.marblePolished).create("marble_polished_slab", new ItemStack(BonusBlocks.slabMarblePolished, 6));
        templateSlab.addInput('X', BonusBlocks.permafrostPolished).create("permafrost_polished_slab", new ItemStack(BonusBlocks.slabPermafrostPolished, 6));
        templateSlab.addInput('X', Block.brickGold).create("gold_brick_slab", new ItemStack(BonusBlocks.slabBrickGold, 6));
        templateSlab.addInput('X', Block.brickIron).create("iron_brick_slab", new ItemStack(BonusBlocks.slabBrickIron, 6));
        templateSlab.addInput('X', Block.brickLapis).create("lapis_brick_slab", new ItemStack(BonusBlocks.slabBrickLapis, 6));
        templateSlab.addInput('X', BonusBlocks.brickMud).create("mud_brick_slab", new ItemStack(BonusBlocks.slabBrickMud, 6));
        templateSlab.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_slab", new ItemStack(BonusBlocks.slabBrickNetherrack, 6));
        templateSlab.addInput('X', Block.brickPermafrost).create("permafrost_brick_slab", new ItemStack(BonusBlocks.slabBrickPermafrost, 6));
        templateSlab.addInput('X', Block.brickSandstone).create("sandstone_brick_slab", new ItemStack(BonusBlocks.slabBrickSandstone, 6));
        templateSlab.addInput('X', Block.brickStonePolishedMossy).create("stone_polished_mossy_brick_slab", new ItemStack(BonusBlocks.slabBrickStonePolishedMossy, 6));
        templateSlab.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_slab", new ItemStack(BonusBlocks.slabBrickScorchedstone, 6));
        templateSlab.addInput('X', BonusBlocks.brickSteel).create("steel_brick_slab", new ItemStack(BonusBlocks.slabBrickSteel, 6));
        templateSlab.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_slab", new ItemStack(BonusBlocks.slabBrickQuartz, 6));
        templateSlab.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_slab", new ItemStack(BonusBlocks.slabBrickOlivine, 6));
        templateSlab.addInput('X', Block.cobblePermafrost).create("cobbled_permafrost_slab", new ItemStack(BonusBlocks.slabCobblePermafrost, 6));
        templateSlab.addInput('X', BonusBlocks.scorchedstone).create("scorchedstone_slab", new ItemStack(BonusBlocks.slabScorchedstone, 6));
        templateSlab.addInput('X', Block.cobbleStoneMossy).create("cobblestone_mossy_slab", new ItemStack(BonusBlocks.slabCobbleStoneMossy, 6));
        templateSlab.addInput('X', Block.netherrack).create("cobblestone_netherrack_mossy_slab", new ItemStack(BonusBlocks.slabCobbleNetherrackMossy, 6));
        templateSlab.addInput('X', BonusBlocks.cobbleNetherrack).create("cobblestone_netherrack_slab", new ItemStack(BonusBlocks.slabCobbleNetherrack, 6));
        templateSlab.addInput('X', BonusItems.ingotCopper).create("copper_slab", new ItemStack(BonusBlocks.slabCopper, 6));

        RecipeBuilderShaped templateStairs = new RecipeBuilderShaped(MOD_ID, "X ", "XX ", "XXX");
        templateStairs.addInput('X', Block.brickGold).create("gold_brick_stairs", new ItemStack(BonusBlocks.stairsBrickGold, 6));
        templateStairs.addInput('X', Block.brickIron).create("iron_brick_stairs", new ItemStack(BonusBlocks.stairsBrickIron, 6));
        templateStairs.addInput('X', Block.brickLapis).create("lapis_brick_stairs", new ItemStack(BonusBlocks.stairsBrickLapis, 6));
        templateStairs.addInput('X', BonusBlocks.brickMud).create("mud_brick_stairs", new ItemStack(BonusBlocks.stairsBrickMud, 6));
        templateStairs.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_stairs", new ItemStack(BonusBlocks.stairsBrickNetherrack, 6));
        templateStairs.addInput('X', Block.brickPermafrost).create("permafrost_brick_stairs", new ItemStack(BonusBlocks.stairsBrickPermafrost, 6));
        templateStairs.addInput('X', Block.brickSandstone).create("sandstone_brick_stairs", new ItemStack(BonusBlocks.stairsBrickSandstone, 6));
        templateStairs.addInput('X', Block.brickStonePolishedMossy).create("stone_polished_mossy_brick_stairs", new ItemStack(BonusBlocks.stairsBrickStonePolishedMossy, 6));
        templateStairs.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_stairs", new ItemStack(BonusBlocks.stairsBrickScorchedstone, 6));
        templateStairs.addInput('X', BonusBlocks.brickSteel).create("steel_brick_stairs", new ItemStack(BonusBlocks.stairsBrickSteel, 6));
        templateStairs.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_stairs", new ItemStack(BonusBlocks.stairsBrickQuartz, 6));
        templateStairs.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_stairs", new ItemStack(BonusBlocks.stairsBrickOlivine, 6));
        templateStairs.addInput('X', Block.cobblePermafrost).create("cobbled_permafrost_stairs", new ItemStack(BonusBlocks.stairsCobblePermafrost, 6));
        templateStairs.addInput('X', Block.cobbleStoneMossy).create("cobblestone_mossy_stairs", new ItemStack(BonusBlocks.stairsCobbleStoneMossy, 6));
        templateStairs.addInput('X', Block.netherrack).create("cobblestone_netherrack_mossy_stairs", new ItemStack(BonusBlocks.stairsCobbleNetherrackMossy, 6));
        templateStairs.addInput('X', BonusBlocks.cobbleNetherrack).create("cobblestone_netherrack_stairs", new ItemStack(BonusBlocks.stairsCobbleNetherrack, 6));
        templateStairs.addInput('X', BonusItems.ingotCopper).create("copper_stairs", new ItemStack(BonusBlocks.stairsCopper, 6));

        RecipeBuilder.Shaped(MOD_ID, " M ", "SES", "WPW")
                .addInput('M', (Item.bucketMilk))
                .addInput('W', (Item.wheat))
                .addInput('S', (Item.dustSugar))
                .addInput('E', (Item.eggChicken))
                .addInput('P', (Block.pumpkin))
                .create("pumpkin_pie", new ItemStack(BonusItems.foodPie, 1));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusItems.ingotCopper)
                .create("crate", new ItemStack(BonusItems.doorCopper, 2));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', BonusItems.ingotCopper)
                .addInput('C', BonusBlocks.blockCopper)
                .create("crate", new ItemStack(BonusBlocks.fenceCopper, 8));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusItems.ingotCopper)
                .create("crate", new ItemStack(BonusBlocks.trapdoorCopper, 6));

        RecipeBuilder.Furnace(MOD_ID)
                .setInput("bonusblocks:copper_ores")
                .create("copper_ores_to_copper", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.blockClay)
                .create("baked_clay_furnace", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusItems.oreRawCopper)
                .create("copper_ingot", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusBlocks.cobbleNetherrack)
                .create("cobble_netherrack_to_netherrack", BonusBlocks.netherrack.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.netherrack)
                .create("mossy_netherrack_to_cobbled_netherrack", BonusBlocks.cobbleNetherrack.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.soulsand)
                .create("soulwax", BonusItems.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput("bonusblocks:copper_ores")
                .create("copper_ores_to_copper_blast", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.blockClay)
                .create("baked_clay_blast", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusItems.oreRawCopper)
                .create("copper_ingot_blast", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.cobbleNetherrack)
                .create("cobble_netherrack_to_netherrack", BonusBlocks.netherrack.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.netherrack)
                .create("mossy_netherrack_to_cobbled_netherrack", BonusBlocks.cobbleNetherrack.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.obsidian)
                .create("obsidian_glass", BonusBlocks.glassObsidian.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.soulsand)
                .create("soulwax_blast", BonusItems.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.cobbleStone)
                .create("cobble_stone_to_stone", Block.stone.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.cobbleBasalt)
                .create("cobble_basalt_to_basalt", Block.basalt.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.cobbleGranite)
                .create("cobble_granite_to_granite", Block.granite.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.limestone)
                .create("limestone_to_marble", Block.marble.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.stone)
                .create("stone_to_slate", Block.slate.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.basalt)
                .create("basalt_to_olivine", Item.olivine.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.granite)
                .create("granite_to_quartz", Item.quartz.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.netherrack)
                .create("netherrack_to_brimstone", BonusBlocks.brimstone.getDefaultStack());

    }

}