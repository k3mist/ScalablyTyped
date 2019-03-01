package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Sankey Graphs**
  *
  * Sankey diagram is a specific type of streamgraphs(can also be seen
  * as a directed acyclic graph).
  * In which the width of each branch is shown proportionally to the
  * flow quantity.
  * These graphs are typically used to visualize energy or material or
  * cost transfers between processes.
  * They can also visualize the energy accounts, material flow accounts
  * on a regional or national level, and also the breakdown of cost of
  * item or services.
  *
  * **Example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey)
  *
  * **Visual Encoding:**
  *
  * The sankey graphs encodes each `node` of the raw data into a small
  * rectangular.
  * And different nodes are presented in different colors as far as possible.
  * The `label` next to the small rectangular, which encoding the name
  * of the node.
  *
  * In addition, the edge between two small rectangulars in the graph
  * encoding the `link` of the raw data.
  * The width of edge is shown proportionally to the `value` of `link`.
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey
  */
trait SeriesSankey extends Series {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "linear"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Distance between sankey component and the bottom side of the
    * container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 5%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.bottom
    */
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Data array of series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the
    * form of array. For example:
    *
    * ```
    * [[12, 14], [34, 50], [56, 30], [10, 15], [23, 10]]
    *
    * ```
    *
    * In this case, we can assgin the second value in each arrary item
    * to
    * [visualMap](https://ecomfe.github.io/echarts-doc/public/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data
    */
  var data: js.UndefOr[
    (js.Array[scala.Double | echartsLib.echartsNs.EChartOptionNs.SeriesSankeyNs.DataObject]) | (js.Array[
      js.Array[scala.Double | echartsLib.echartsNs.EChartOptionNs.SeriesSankeyNs.DataObject]
    ])
  ] = js.undefined
  /**
    * The drag-and-drop interaction of the node, which is enabled by
    * default.
    * After opening, the user can drag any node in the Sankey diagram
    * to any position.
    * To turn this interaction off, simply set the value to `false`.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.draggable
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Equals to
    * [links](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.edges
    */
  var edges: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelLineStyle] = js.undefined
  /**
    * Support when mouse hovering over a node or an edge, the adjacent
    * nodes and edges are also highlighted.
    * Default off, can be manually opened.
    *
    * Optional values:
    *
    * + `false`: When hovering over a node or an edge, only the hovered
    * node or edge is highlighted.
    * + `true`: the same as `'allEdges'`.
    * + `'allEdges'`: When hovering over a node, all of the adjacent
    * edges and nodes are highlighted.
    * When hovering over an edge, the adjacent nodes are highlighted.
    * + `'outEdges'`: When hovering over a node, the outcoming edges
    * and its adjacent nodes are highlighted.
    * When hovering over an edge, the adjacent nodes are highlighted.
    * + `'inEdges'`: When hovering over a node, the incoming edges
    * and its adjacent nodes are highlighted.
    * When hovering over an edge, the adjacent nodes are highlighted.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.focusNodeAdjacency
    */
  var focusNodeAdjacency: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Height of sankey component.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style of node rectangle in sankey graphs.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * `label` describes the text label style in each rectangular node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily
  ] = js.undefined
  /**
    * The iterations of layout, which is used to continuously optimize
    * the positions of nodes in graph, decreasing the overlapping between
    * nodes and edges.
    *
    * The default iterations of layout: `32`.
    *
    * The test shows that iterations of layout could not be less than
    * the default value.
    *
    *
    * @default
    * 32
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.layoutIterations
    */
  var layoutIterations: js.UndefOr[scala.Double] = js.undefined
  /**
    * Distance between sankey component and the left side of the container.
    *
    * `left` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or `'right'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * 5%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.left
    */
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The line style of sankey graph, in which
    * [lineStyle.color](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.lineStyle.color)
    * can be assigned to the value of `'source'` of `'target'`, then
    * the edge will automatically take the source node or target node
    * color as its own color.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.lineStyle
    */
  var lineStyle: js.UndefOr[echartsLib.Anon_ColorCurvenessOpacityShadowBlurShadowColor] = js.undefined
  /**
    * The links between nodes.
    * **Notes: The Sankey diagram theoretically only supports Directed
    * Acyclic Graph(DAG), so please make sure that there is no cycle
    * in the links.** For instance:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.sankey)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.links
    */
  var links: js.UndefOr[echartsLib.Anon_EmphasisLineStyle] = js.undefined
  /**
    * The gap between any two rectangles in each column from the graph.
    *
    *
    * @default
    * 8
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.nodeGap
    */
  var nodeGap: js.UndefOr[scala.Double] = js.undefined
  /**
    * The node width of rectangle in graph.
    *
    *
    * @default
    * 20
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.nodeWidth
    */
  var nodeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Equals to
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.nodes
    */
  var nodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The layout direction of the nodes in the Sankey diagram, which
    * can be horizontal from left to right or vertical from top to
    * bottom.
    * The corresponding parameter values ​​are `horizontal` or `vertical`.
    *
    *
    * @default
    * "horizontal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.orient
    */
  var orient: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Distance between sankey component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 20%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.right
    */
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.silent
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Distance between sankey component and the top side of the container.
    *
    * `top` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or `'bottom'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * 5%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.top
    */
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default
    * "sankey"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of sankey component.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in .
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-sankey.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

object SeriesSankey {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    animationDelay: js.Function | scala.Double = null,
    animationDelayUpdate: js.Function | scala.Double = null,
    animationDuration: js.Function | scala.Double = null,
    animationDurationUpdate: js.Function | scala.Double = null,
    animationEasing: java.lang.String = null,
    animationEasingUpdate: java.lang.String = null,
    animationThreshold: scala.Int | scala.Double = null,
    bottom: scala.Double | java.lang.String = null,
    data: (js.Array[scala.Double | echartsLib.echartsNs.EChartOptionNs.SeriesSankeyNs.DataObject]) | (js.Array[
      js.Array[scala.Double | echartsLib.echartsNs.EChartOptionNs.SeriesSankeyNs.DataObject]
    ]) = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    edges: js.Array[_] = null,
    emphasis: echartsLib.Anon_ItemStyleLabelLineStyle = null,
    focusNodeAdjacency: scala.Boolean | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    id: java.lang.String = null,
    itemStyle: echartsLib.Anon_BorderColorBorderTypeBorderWidth = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily = null,
    layoutIterations: scala.Int | scala.Double = null,
    left: scala.Double | java.lang.String = null,
    lineStyle: echartsLib.Anon_ColorCurvenessOpacityShadowBlurShadowColor = null,
    links: echartsLib.Anon_EmphasisLineStyle = null,
    nodeGap: scala.Int | scala.Double = null,
    nodeWidth: scala.Int | scala.Double = null,
    nodes: js.Array[_] = null,
    orient: java.lang.String = null,
    right: scala.Double | java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    top: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Double | java.lang.String = null,
    z: scala.Int | scala.Double = null,
    zlevel: scala.Int | scala.Double = null
  ): SeriesSankey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (edges != null) __obj.updateDynamic("edges")(edges)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (focusNodeAdjacency != null) __obj.updateDynamic("focusNodeAdjacency")(focusNodeAdjacency.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layoutIterations != null) __obj.updateDynamic("layoutIterations")(layoutIterations.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (links != null) __obj.updateDynamic("links")(links)
    if (nodeGap != null) __obj.updateDynamic("nodeGap")(nodeGap.asInstanceOf[js.Any])
    if (nodeWidth != null) __obj.updateDynamic("nodeWidth")(nodeWidth.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSankey]
  }
}

