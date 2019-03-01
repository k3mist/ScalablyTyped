package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/node-body
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof cytoscape.cytoscape.cytoscape.Css.Overlay ]:? cytoscape.cytoscape.cytoscape.Css.Overlay[P]} */ trait Node extends PaddingNode {
  /**
    * Blackens the node’s body for values from 0 to 1;
    * whitens the node’s body for values from 0 to -1.
    */
  var `background-blacken`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The colour of the node’s body.
    */
  var `background-color`: js.UndefOr[Colour] = js.undefined
  /**
    * The opacity level of the node’s background colour.
    */
  var `background-opacity`: js.UndefOr[scala.Double] = js.undefined
  var backgroundColor: js.UndefOr[Colour] = js.undefined
  /**
    * The colour of the node’s border.
    */
  var `border-color`: js.UndefOr[Colour] = js.undefined
  /**
    * The opacity of the node’s border.
    * A value between [0 1].
    */
  var `border-opacity`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The style of the node’s border.
    */
  var `border-style`: js.UndefOr[LineStyle] = js.undefined
  /**
    * The size of the node’s border.
    */
  var `border-width`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the node’s body.
    * This property can take on the special value label
    * so the height is automatically based on the node’s label.
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The shape of the node’s body.
    */
  var shape: js.UndefOr[NodeShape] = js.undefined
  var `shape-polygon-points`: js.UndefOr[ShapePolygonPoints] = js.undefined
  var `text-opacity`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the node’s body.
    * This property can take on the special value label
    * so the width is automatically based on the node’s label.
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    `background-blacken`: scala.Int | scala.Double = null,
    `background-color`: Colour = null,
    `background-opacity`: scala.Int | scala.Double = null,
    backgroundColor: Colour = null,
    `border-color`: Colour = null,
    `border-opacity`: scala.Int | scala.Double = null,
    `border-style`: LineStyle = null,
    `border-width`: scala.Int | scala.Double = null,
    height: scala.Double | java.lang.String = null,
    label: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    `padding-bottom`: java.lang.String = null,
    `padding-left`: java.lang.String = null,
    `padding-right`: java.lang.String = null,
    `padding-top`: java.lang.String = null,
    shape: NodeShape = null,
    `shape-polygon-points`: ShapePolygonPoints = null,
    `text-opacity`: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (`background-blacken` != null) __obj.updateDynamic("background-blacken")(`background-blacken`.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`)
    if (`background-opacity` != null) __obj.updateDynamic("background-opacity")(`background-opacity`.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`)
    if (`border-opacity` != null) __obj.updateDynamic("border-opacity")(`border-opacity`.asInstanceOf[js.Any])
    if (`border-style` != null) __obj.updateDynamic("border-style")(`border-style`)
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`)
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`)
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`)
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (`shape-polygon-points` != null) __obj.updateDynamic("shape-polygon-points")(`shape-polygon-points`)
    if (`text-opacity` != null) __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

