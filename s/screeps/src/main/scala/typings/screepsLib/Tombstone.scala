package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A remnant of dead creeps. This is a walkable structure.
  * <ul>
  *     <li>Decay: 5 ticks per body part of the deceased creep</li>
  * </ul>
  */
trait Tombstone extends RoomObject {
  /**
    * An object containing the deceased creep.
    */
  var creep: Creep
  /**
    * Time of death.
    */
  var deathTime: scala.Double
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: java.lang.String
  /**
    * An object with the tombstone contents.
    * Each object key is one of the RESOURCE_* constants, values are resources amounts.
    * RESOURCE_ENERGY is always defined and equals to 0 when empty,
    * other resources are undefined when empty.
    * You can use lodash.sum to get the total amount of contents.
    */
  var store: StoreDefinition
  /**
    * The amount of game ticks before this tombstone decays.
    */
  var ticksToDecay: scala.Double
}

object Tombstone {
  @scala.inline
  def apply(
    creep: Creep,
    deathTime: scala.Double,
    id: java.lang.String,
    pos: RoomPosition,
    store: StoreDefinition,
    ticksToDecay: scala.Double,
    room: Room = null
  ): Tombstone = {
    val __obj = js.Dynamic.literal(creep = creep, deathTime = deathTime, id = id, pos = pos, store = store, ticksToDecay = ticksToDecay)
    if (room != null) __obj.updateDynamic("room")(room)
    __obj.asInstanceOf[Tombstone]
  }
}

