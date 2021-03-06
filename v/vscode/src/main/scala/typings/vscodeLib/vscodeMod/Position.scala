package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Position")
@js.native
class Position protected () extends js.Object {
  /**
  		 * @param line A zero-based line value.
  		 * @param character A zero-based character value.
  		 */
  def this(line: scala.Double, character: scala.Double) = this()
  /**
  		 * The zero-based character value.
  		 */
  val character: scala.Double = js.native
  /**
  		 * The zero-based line value.
  		 */
  val line: scala.Double = js.native
  /**
  		 * Compare this to `other`.
  		 *
  		 * @param other A position.
  		 * @return A number smaller than zero if this position is before the given position,
  		 * a number greater than zero if this position is after the given position, or zero when
  		 * this and the given position are equal.
  		 */
  def compareTo(other: Position): scala.Double = js.native
  /**
  		 * Check if `other` is after this position.
  		 *
  		 * @param other A position.
  		 * @return `true` if position is on a greater line
  		 * or on the same line on a greater character.
  		 */
  def isAfter(other: Position): scala.Boolean = js.native
  /**
  		 * Check if `other` is after or equal to this position.
  		 *
  		 * @param other A position.
  		 * @return `true` if position is on a greater line
  		 * or on the same line on a greater or equal character.
  		 */
  def isAfterOrEqual(other: Position): scala.Boolean = js.native
  /**
  		 * Check if `other` is before this position.
  		 *
  		 * @param other A position.
  		 * @return `true` if position is on a smaller line
  		 * or on the same line on a smaller character.
  		 */
  def isBefore(other: Position): scala.Boolean = js.native
  /**
  		 * Check if `other` is before or equal to this position.
  		 *
  		 * @param other A position.
  		 * @return `true` if position is on a smaller line
  		 * or on the same line on a smaller or equal character.
  		 */
  def isBeforeOrEqual(other: Position): scala.Boolean = js.native
  /**
  		 * Check if `other` equals this position.
  		 *
  		 * @param other A position.
  		 * @return `true` if the line and character of the given position are equal to
  		 * the line and character of this position.
  		 */
  def isEqual(other: Position): scala.Boolean = js.native
  /**
  		 * Create a new position relative to this position.
  		 *
  		 * @param lineDelta Delta value for the line value, default is `0`.
  		 * @param characterDelta Delta value for the character value, default is `0`.
  		 * @return A position which line and character is the sum of the current line and
  		 * character and the corresponding deltas.
  		 */
  def translate(): Position = js.native
  /**
  		 * Derived a new position relative to this position.
  		 *
  		 * @param change An object that describes a delta to this position.
  		 * @return A position that reflects the given delta. Will return `this` position if the change
  		 * is not changing anything.
  		 */
  def translate(change: vscodeLib.Anon_CharacterDelta): Position = js.native
  def translate(lineDelta: scala.Double): Position = js.native
  def translate(lineDelta: scala.Double, characterDelta: scala.Double): Position = js.native
  /**
  		 * Create a new position derived from this position.
  		 *
  		 * @param line Value that should be used as line value, default is the [existing value](#Position.line)
  		 * @param character Value that should be used as character value, default is the [existing value](#Position.character)
  		 * @return A position where line and character are replaced by the given values.
  		 */
  def `with`(): Position = js.native
  /**
  		 * Derived a new position from this position.
  		 *
  		 * @param change An object that describes a change to this position.
  		 * @return A position that reflects the given change. Will return `this` position if the change
  		 * is not changing anything.
  		 */
  def `with`(change: vscodeLib.Anon_Character): Position = js.native
  def `with`(line: scala.Double): Position = js.native
  def `with`(line: scala.Double, character: scala.Double): Position = js.native
}

