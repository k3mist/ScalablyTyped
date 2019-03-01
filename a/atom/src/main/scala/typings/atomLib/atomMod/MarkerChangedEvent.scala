package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerChangedEvent extends js.Object {
  /** Boolean indicating whether the marker had a tail before the change. */
  var hadTail: scala.Boolean
  /** Boolean indicating whether the marker now has a tail. */
  var hasTail: scala.Boolean
  /** Boolean indicating whether the marker is now valid. */
  var isValid: scala.Boolean
  /** Point representing the new head position. */
  var newHeadPosition: Point
  /**
    *  -DEPRECATED- Object containing the marker's custom properties after the change.
    *  @deprecated
    */
  var newProperties: js.Object
  /** Point representing the new tail position. */
  var newTailPosition: Point
  /** Point representing the former head position. */
  var oldHeadPosition: Point
  /**
    *  -DEPRECATED- Object containing the marker's custom properties before the change.
    *  @deprecated
    */
  var oldProperties: js.Object
  /** Point representing the former tail position. */
  var oldTailPosition: Point
  /**
    *  Boolean indicating whether this change was caused by a textual
    *  change to the buffer or whether the marker was manipulated directly
    *  via its public API.
    */
  var textChanged: scala.Boolean
  /** Boolean indicating whether the marker was valid before the change. */
  var wasValid: scala.Boolean
}

object MarkerChangedEvent {
  @scala.inline
  def apply(
    hadTail: scala.Boolean,
    hasTail: scala.Boolean,
    isValid: scala.Boolean,
    newHeadPosition: Point,
    newProperties: js.Object,
    newTailPosition: Point,
    oldHeadPosition: Point,
    oldProperties: js.Object,
    oldTailPosition: Point,
    textChanged: scala.Boolean,
    wasValid: scala.Boolean
  ): MarkerChangedEvent = {
    val __obj = js.Dynamic.literal(hadTail = hadTail, hasTail = hasTail, isValid = isValid, newHeadPosition = newHeadPosition, newProperties = newProperties, newTailPosition = newTailPosition, oldHeadPosition = oldHeadPosition, oldProperties = oldProperties, oldTailPosition = oldTailPosition, textChanged = textChanged, wasValid = wasValid)
  
    __obj.asInstanceOf[MarkerChangedEvent]
  }
}

