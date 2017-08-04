package org.terraframe;

import java.io.Serializable;
import java.util._;

case class WorldContainer(
    blocks: Array3D[Int],
    blockds: Array3D[Byte],
    blockdns: Array2D[Byte],
    blockbgs: Array2D[Byte],
    blockts: Array2D[Byte],
    lights: Array2D[Float],
    power: Array3D[Float],
    drawn: Array2D[Boolean],
    ldrawn: Array2D[Boolean],
    rdrawn: Array2D[Boolean],
    player: Player,
    inventory: Inventory,
    cic: ItemCollection,
    entities: ArrayList[Entity],
    cloudsx: ArrayList[Double],
    cloudsy: ArrayList[Double],
    cloudsv: ArrayList[Double],
    cloudsn: ArrayList[Int],
    machinesx: ArrayList[Int],
    machinesy: ArrayList[Int],
    lsources: Array2D[Boolean],
    lqx: ArrayList[Int],
    lqy: ArrayList[Int],
    lqd: Array2D[Boolean],
    rgnc1: Int,
    rgnc2: Int,
    layer: Int,
    layerTemp: Int,
    blockTemp: Int,
    mx: Int,
    my: Int,
    icx: Int,
    icy: Int,
    mining: Int,
    immune: Int,
    moveItem: Short,
    moveNum: Short,
    moveItemTemp: Short,
    moveNumTemp: Short,
    msi: Int,
    toolAngle: Double,
    toolSpeed: Double,
    timeOfDay: Double,
    currentSkyLight: Int,
    day: Int,
    mobCount: Int,
    ready: Boolean,
    showTool: Boolean,
    showInv: Boolean,
    doMobSpawn: Boolean,
    WIDTH: Int,
    HEIGHT: Int,
    random: Random,
    WORLDWIDTH: Int,
    WORLDHEIGHT: Int,
    resunlight: Int,
    ic: ItemCollection,
    kworlds: Array2D[Boolean],
    icmatrix: Array3D[ItemCollection],
    version: String)
        extends Serializable
