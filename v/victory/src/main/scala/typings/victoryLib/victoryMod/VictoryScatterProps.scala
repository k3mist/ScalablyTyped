package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryScatterProps
  extends VictoryMultiLabeableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The bubbleProperty prop indicates which property of the data object should be used
    * to scale data points in a bubble chart
    */
  var bubbleProperty: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryScatter
    * events. The eventKey may optionally be used to select a single element by index rather than
    * an entire set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
    * events={[
    *   {
    *     target: "data",
    *     eventKey: "thisOne",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              eventKey: "theOtherOne",
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              eventKey: "theOtherOne",
    *              target: "labels",
    *              mutation: () => {
    *                return {text: "hey"};
    *              }
    *            }
    *          ];
    *       }
    *     }
    *   }
    * ]}
    */
  var events: js.UndefOr[
    js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.data | victoryLib.victoryLibStrings.labels | victoryLib.victoryLibStrings.parent, 
        StringOrNumberOrCallback
      ]
    ]
  ] = js.undefined
  /**
    * The maxBubbleSize prop sets an upper limit for scaling data points in a bubble chart
    */
  var maxBubbleSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    */
  var samples: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size prop determines how to scale each data point
    */
  var size: js.UndefOr[scala.Double | victoryLib.Anon_Data] = js.undefined
  /**
    * The style prop specifies styles for your VictoryScatter. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
  /**
    * The symbol prop determines which symbol should be drawn to represent data points.
    */
  var symbol: js.UndefOr[ScatterSymbolType | victoryLib.Anon_DataAny] = js.undefined
}

object VictoryScatterProps {
  @scala.inline
  def apply(
    animate: AnimatePropTypeInterface = null,
    bubbleProperty: java.lang.String = null,
    categories: CategoryPropType = null,
    containerComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    data: js.Array[_] = null,
    dataComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    domain: DomainPropType = null,
    eventKey: StringOrNumberOrCallback = null,
    events: js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.data | victoryLib.victoryLibStrings.labels | victoryLib.victoryLibStrings.parent, 
        StringOrNumberOrCallback
      ]
    ] = null,
    groupComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    height: scala.Int | scala.Double = null,
    labelComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    labels: js.Array[java.lang.String] | victoryLib.Anon_DataAnyString = null,
    maxBubbleSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    padding: scala.Double | victoryLib.Anon_BottomLeft = null,
    samples: scala.Int | scala.Double = null,
    scale: ScalePropType | D3Scale | victoryLib.Anon_XYD3Scale = null,
    size: scala.Double | victoryLib.Anon_Data = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    symbol: ScatterSymbolType | victoryLib.Anon_DataAny = null,
    theme: VictoryThemeDefinition = null,
    width: scala.Int | scala.Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null
  ): VictoryScatterProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (bubbleProperty != null) __obj.updateDynamic("bubbleProperty")(bubbleProperty)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (maxBubbleSize != null) __obj.updateDynamic("maxBubbleSize")(maxBubbleSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryScatterProps]
  }
}

