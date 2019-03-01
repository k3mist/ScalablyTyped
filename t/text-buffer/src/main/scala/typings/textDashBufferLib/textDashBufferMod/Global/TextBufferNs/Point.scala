package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a point in a buffer in row/column coordinates. */
trait Point extends js.Object {
  /** A zero-indexed number representing the column of the Point. */
  var column: scala.Double
  // Properties
  /** A zero-indexed number representing the row of the Point. */
  var row: scala.Double
  // Comparison
  /**
    *  Compare another Point to this Point instance.
    *  Returns -1 if this point precedes the argument.
    *  Returns 0 if this point is equivalent to the argument.
    *  Returns 1 if this point follows the argument.
    */
  def compare(other: PointCompatible): scala.Double
  // Construction
  /** Returns a new Point with the same row and column. */
  def copy(): Point
  // Operations
  /** Makes this point immutable and returns itself. */
  def freeze(): stdLib.Readonly[Point]
  /**
    *  Returns a boolean indicating whether this point has the same row and
    *  column as the given Point.
    */
  def isEqual(other: PointCompatible): scala.Boolean
  /** Returns a Boolean indicating whether this point follows the given Point. */
  def isGreaterThan(other: PointCompatible): scala.Boolean
  /**
    *  Returns a Boolean indicating whether this point follows or is equal to
    *  the given Point.
    */
  def isGreaterThanOrEqual(other: PointCompatible): scala.Boolean
  /** Returns a Boolean indicating whether this point precedes the given Point. */
  def isLessThan(other: PointCompatible): scala.Boolean
  /**
    *  Returns a Boolean indicating whether this point precedes or is equal to
    *  the given Point.
    */
  def isLessThanOrEqual(other: PointCompatible): scala.Boolean
  /** Returns a new Point with the row and column negated. */
  def negate(): Point
  /** Returns an array of this point's row and column. */
  def serialize(): js.Tuple2[scala.Double, scala.Double]
  /** Returns an array of this point's row and column. */
  def toArray(): js.Tuple2[scala.Double, scala.Double]
  /**
    *  Build and return a new point by adding the rows and columns of the
    *  given point.
    */
  def translate(other: PointCompatible): Point
  /**
    *  Build and return a new Point by traversing the rows and columns
    *  specified by the given point.
    */
  def traverse(other: PointCompatible): Point
}

object Point {
  @scala.inline
  def apply(
    column: scala.Double,
    compare: js.Function1[PointCompatible, scala.Double],
    copy: js.Function0[Point],
    freeze: js.Function0[stdLib.Readonly[Point]],
    isEqual: js.Function1[PointCompatible, scala.Boolean],
    isGreaterThan: js.Function1[PointCompatible, scala.Boolean],
    isGreaterThanOrEqual: js.Function1[PointCompatible, scala.Boolean],
    isLessThan: js.Function1[PointCompatible, scala.Boolean],
    isLessThanOrEqual: js.Function1[PointCompatible, scala.Boolean],
    negate: js.Function0[Point],
    row: scala.Double,
    serialize: js.Function0[js.Tuple2[scala.Double, scala.Double]],
    toArray: js.Function0[js.Tuple2[scala.Double, scala.Double]],
    toString: js.Function0[java.lang.String],
    translate: js.Function1[PointCompatible, Point],
    traverse: js.Function1[PointCompatible, Point]
  ): Point = {
    val __obj = js.Dynamic.literal(column = column, compare = compare, copy = copy, freeze = freeze, isEqual = isEqual, isGreaterThan = isGreaterThan, isGreaterThanOrEqual = isGreaterThanOrEqual, isLessThan = isLessThan, isLessThanOrEqual = isLessThanOrEqual, negate = negate, row = row, serialize = serialize, toArray = toArray, toString = toString, translate = translate, traverse = traverse)
  
    __obj.asInstanceOf[Point]
  }
}

