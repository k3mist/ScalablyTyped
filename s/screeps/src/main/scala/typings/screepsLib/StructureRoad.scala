package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Decreases movement cost to 1. Using roads allows creating creeps with less
  * `MOVE` body parts.
  */
trait StructureRoad
  extends Structure[STRUCTURE_ROAD]
     with AnyStructure {
  /**
    * The amount of game ticks when this road will lose some hit points.
    */
  var ticksToDecay: scala.Double
}

object StructureRoad {
  @scala.inline
  def apply(
    destroy: js.Function0[ScreepsReturnCode],
    hits: scala.Double,
    hitsMax: scala.Double,
    id: java.lang.String,
    isActive: js.Function0[scala.Boolean],
    notifyWhenAttacked: js.Function1[scala.Boolean, ScreepsReturnCode],
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_ROAD,
    ticksToDecay: scala.Double
  ): StructureRoad = {
    val __obj = js.Dynamic.literal(destroy = destroy, hits = hits, hitsMax = hitsMax, id = id, isActive = isActive, notifyWhenAttacked = notifyWhenAttacked, pos = pos, room = room, structureType = structureType, ticksToDecay = ticksToDecay)
  
    __obj.asInstanceOf[StructureRoad]
  }
}

