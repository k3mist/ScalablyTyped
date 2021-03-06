package typings
package prosemirrorDashModelLib.prosemirrorDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-model", "ResolvedPos")
@js.native
class ResolvedPos[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * The number of levels the parent node is from the root. If this
    * position points directly into the root node, it is 0. If it
    * points into a top-level paragraph, 1, and so on.
    */
  var depth: scala.Double = js.native
  /**
    * The root node in which the position was resolved.
    */
  var doc: ProsemirrorNode[S] = js.native
  /**
    * Get the node directly after the position, if any. If the position
    * points into a text node, only the part of that node after the
    * position is returned.
    */
  var nodeAfter: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * Get the node directly before the position, if any. If the
    * position points into a text node, only the part of that node
    * before the position is returned.
    */
  var nodeBefore: js.UndefOr[ProsemirrorNode[S] | scala.Null] = js.native
  /**
    * The parent node that the position points into. Note that even if
    * a position points into a text node, that node is not considered
    * the parent—text nodes are ‘flat’ in this model, and have no content.
    */
  var parent: ProsemirrorNode[S] = js.native
  /**
    * The offset this position has into its parent node.
    */
  var parentOffset: scala.Double = js.native
  /**
    * The position that was resolved.
    */
  var pos: scala.Double = js.native
  /**
    * When this position points into a text node, this returns the
    * distance between the position and the start of the text node.
    * Will be zero for positions that point between nodes.
    */
  var textOffset: scala.Double = js.native
  /**
    * The (absolute) position directly after the wrapping node at the
    * given level, or the original position when `level` is `this.depth + 1`.
    */
  def after(): scala.Double = js.native
  def after(depth: scala.Double): scala.Double = js.native
  /**
    * The (absolute) position directly before the wrapping node at the
    * given level, or, when `level` is `this.depth + 1`, the original
    * position.
    */
  def before(): scala.Double = js.native
  def before(depth: scala.Double): scala.Double = js.native
  /**
    * Returns a range based on the place where this position and the
    * given position diverge around block content. If both point into
    * the same textblock, for example, a range around that textblock
    * will be returned. If they point into different blocks, the range
    * around those blocks in their shared ancestor is returned. You can
    * pass in an optional predicate that will be called with a parent
    * node to see if a range into that parent is acceptable.
    */
  def blockRange(): js.UndefOr[NodeRange[S] | scala.Null] = js.native
  def blockRange(other: ResolvedPos[S]): js.UndefOr[NodeRange[S] | scala.Null] = js.native
  def blockRange(other: ResolvedPos[S], pred: js.Function1[/* p */ ProsemirrorNode[S], scala.Boolean]): js.UndefOr[NodeRange[S] | scala.Null] = js.native
  /**
    * The (absolute) position at the end of the node at the given
    * level.
    */
  def end(): scala.Double = js.native
  def end(depth: scala.Double): scala.Double = js.native
  /**
    * The index into the ancestor at the given level. If this points at
    * the 3rd node in the 2nd paragraph on the top level, for example,
    * `p.index(0)` is 2 and `p.index(1)` is 3.
    */
  def index(): scala.Double = js.native
  def index(depth: scala.Double): scala.Double = js.native
  /**
    * The index pointing after this position into the ancestor at the
    * given level.
    */
  def indexAfter(): scala.Double = js.native
  def indexAfter(depth: scala.Double): scala.Double = js.native
  /**
    * Get the marks at this position, factoring in the surrounding
    * marks' [`inclusive`](#model.MarkSpec.inclusive) property. If the
    * position is at the start of a non-empty node, the marks of the
    * node after it (if any) are returned.
    */
  def marks(): js.Array[Mark[S]] = js.native
  /**
    * Get the marks after the current position, if any, except those
    * that are non-inclusive and not present at position `$end`. This
    * is mostly useful for getting the set of marks to preserve after a
    * deletion. Will return `null` if this position is at the end of
    * its parent node or its parent node isn't a textblock (in which
    * case no marks should be preserved).
    */
  def marksAcross($end: ResolvedPos[S]): js.UndefOr[js.Array[Mark[S]] | scala.Null] = js.native
  /**
    * Return the greater of this and the given position.
    */
  def max(other: ResolvedPos[S]): ResolvedPos[S] = js.native
  /**
    * Return the smaller of this and the given position.
    */
  def min(other: ResolvedPos[S]): ResolvedPos[S] = js.native
  /**
    * The ancestor node at the given level. `p.node(p.depth)` is the
    * same as `p.parent`.
    */
  def node(): ProsemirrorNode[S] = js.native
  def node(depth: scala.Double): ProsemirrorNode[S] = js.native
  /**
    * Query whether the given position shares the same parent node.
    */
  def sameParent(other: ResolvedPos[S]): scala.Boolean = js.native
  /**
    * The depth up to which this position and the given (non-resolved)
    * position share the same parent nodes.
    */
  def sharedDepth(pos: scala.Double): scala.Double = js.native
  /**
    * The (absolute) position at the start of the node at the given
    * level.
    */
  def start(): scala.Double = js.native
  def start(depth: scala.Double): scala.Double = js.native
}

