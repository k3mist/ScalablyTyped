package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Tree Diagram**
  *
  * The tree diagram is mainly used to visualize the tree data structure,
  * which is a special hierarchical type with a unique root node, left
  * subtree, and right subtree.
  *
  * **Note: Forests are not currently supported directly in a single
  * series, and can be implemented by configuring multiple series in
  * an option**
  *
  * **Tree example：**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree)
  *
  * **Multiple series are combined into forest：**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree
  */
trait SeriesTree extends Series {
  /**
    * Distance between tree component and the bottom side of the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 12%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.bottom
    */
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * [series-tree.data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data)
    * the data format is a tree structure，for example：
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data
    */
  var data: js.UndefOr[js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesTreeNs.DataObject]] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor] = js.undefined
  /**
    * Subtree collapses and expands interaction, `default true`.
    * As the drawing area is limited, and usually the nodes of a tree
    * may be more, so there will be hidden between the nodes.
    * In order to avoid this problem, you can put a temporary unrelated
    * subtree folded away, until you need to start when necessary.
    * Such as the above radial layout tree example, the center of the
    * node is filled with blue is the folded away subtree, you can
    * click to expand it.
    *
    * **Note: If you configure a custom image as the tag for a node,
    * it is not possible to distinguish whether the current node has
    * a collapsed subtree by the fill color.
    * And currently do not support, upload two pictures, respectively
    * represent the collapsing and expansion state of the node.
    * So, if you want to explicitly show the two states of the node,
    * it is recommended to use `ECharts` regular tag types, such as
    * `emptyCircle`.**
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.expandAndCollapse
    */
  var expandAndCollapse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height of tree component.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial level (depth) of the tree.
    * The root node is the 0th layer, then the first layer, the second
    * layer,
    *
    *
    *
    * , until the leaf node.
    * This configuration item is primarily used in conjunction with
    * `collapsing and expansion` interactions.
    * The purpose is to prevent the nodes from obscuring each other.
    * If set as -1 or `null` or `undefined`, all nodes are expanded.
    *
    *
    * @default
    * 2
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.initialTreeDepth
    */
  var initialTreeDepth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The style of each node in the tree, where \[itemStyle.color\]
    * (~ series-tree.itemStyle.color)
    * represents the fill color of the node, to distinguish the state
    * of the subtree corresponding to `collapsing` or `expansion`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * `label` describes the style of the text corresponding to each
    * node.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily
  ] = js.undefined
  /**
    * The layout of the tree, which can be `orthogonal` and `radial`
    * 。Here the `orthogonal` layout is what we usually refer to the
    * `horizontal` and `vertical` direction, the corresponding parameter
    * value is `orthogonal`.
    * The `radial` layout refers to the view that the root node as
    * the center and each layer of nodes as the ring, the corresponding
    * parameter value is `radial`.
    *
    * **Orthogonal Example：**
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree)
    *
    * **Radial Example：**
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree)
    *
    *
    * @default
    * "orthogonal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.layout
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Leaf node special configuration, such as the above tree diagram
    * example, the leaf node and non-leaf node label location is different.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.leaves
    */
  var leaves: js.UndefOr[echartsLib.Anon_EmphasisItemStyleLabel] = js.undefined
  /**
    * Distance between tree component and the left side of the container.
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
    * 12%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.left
    */
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Defines the style of the tree edge.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.lineStyle
    */
  var lineStyle: js.UndefOr[echartsLib.Anon_ColorCurvenessShadowBlur] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The direction of the `orthogonal` layout in the tree diagram.
    * That means this configuration takes effect only if `layout =
    * 'orthogonal'`.
    * The corresponding directions are `from left to right`, `from
    * right to left`, `from top to bottom`, `from bottom to top`, with
    * shorthand values `'LR'`, `'RL'`, `'TB'`, `'BT'`.
    * **Note: The previous configuration value `'horizontal'` is equivalent
    * to `'LR'`, `'vertical'` is equivalent to `'TB'`.**
    *
    *
    * @default
    * "LR"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.orient
    */
  var orient: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Distance between tree component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    *
    * @default
    * 12%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.right
    */
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.roam
    */
  var roam: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which URL
    * is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree)
    *
    * Icons can be set to arbitrary vector path via `'path://'` in
    * ECharts.
    * As compared with raster image, vector paths prevent from jagging
    * and blurring when scaled, and have a better control over changing
    * colors.
    * Size of vectoer icon will be adapted automatically. Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tree)
    *
    *
    * @default
    * "emptyCircle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position of data.
    * But if symbol is from user-defined vector path or image, you
    * may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to default
    * position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.symbolRotate
    */
  var symbolRotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an array to
    * represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    * If size of symbols needs to be different, you can set with callback
    * function in the following format:
    *
    * ```
    * (value: Array|number, params: Object) => number|Array
    *
    * ```
    *
    * The first parameter `value` is the value in
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 7
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | scala.Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * Distance between tree component and the top side of the container.
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
    * 12%
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.top
    */
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @default
    * "tree"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width of tree component.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.width
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.z
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-tree.zlevel
    */
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

object SeriesTree {
  @scala.inline
  def apply(
    bottom: scala.Double | java.lang.String = null,
    data: js.Array[echartsLib.echartsNs.EChartOptionNs.SeriesTreeNs.DataObject] = null,
    emphasis: echartsLib.Anon_ItemStyleLabelLineStyleAnonAlignBackgroundColorBorderColor = null,
    expandAndCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    id: java.lang.String = null,
    initialTreeDepth: scala.Int | scala.Double = null,
    itemStyle: echartsLib.Anon_BorderColorBorderTypeBorderWidth = null,
    label: echartsLib.Anon_AlignBackgroundColorBorderColorBorderRadiusBorderWidthColorDistanceFontFamily = null,
    layout: java.lang.String = null,
    leaves: echartsLib.Anon_EmphasisItemStyleLabel = null,
    left: scala.Double | java.lang.String = null,
    lineStyle: echartsLib.Anon_ColorCurvenessShadowBlur = null,
    name: java.lang.String = null,
    orient: java.lang.String = null,
    right: scala.Double | java.lang.String = null,
    roam: scala.Boolean | java.lang.String = null,
    symbol: java.lang.String = null,
    symbolKeepAspect: js.UndefOr[scala.Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: scala.Int | scala.Double = null,
    symbolSize: js.Array[_] | js.Function | scala.Double = null,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    top: scala.Double | java.lang.String = null,
    `type`: java.lang.String = null,
    width: scala.Double | java.lang.String = null,
    z: scala.Int | scala.Double = null,
    zlevel: scala.Int | scala.Double = null
  ): SeriesTree = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (!js.isUndefined(expandAndCollapse)) __obj.updateDynamic("expandAndCollapse")(expandAndCollapse)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialTreeDepth != null) __obj.updateDynamic("initialTreeDepth")(initialTreeDepth.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (leaves != null) __obj.updateDynamic("leaves")(leaves)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (name != null) __obj.updateDynamic("name")(name)
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (roam != null) __obj.updateDynamic("roam")(roam.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect)
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset)
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTree]
  }
}

