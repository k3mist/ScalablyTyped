package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryLineProps
  extends VictorySingleLabableProps
     with VictoryCommonProps
     with VictoryDatableProps {
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryLine events.
    * Since VictoryLine only renders a single element, the eventKey property is not used.
    * The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a line), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
    * events={[
    *   {
    *     target: "data",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {stroke: "orange"})};
    *              }
    *            }, {
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
        scala.Double | java.lang.String
      ]
    ]
  ] = js.undefined
  /**
    * The interpolation prop determines how data points should be connected
    * when plotting a line
    */
  var interpolation: js.UndefOr[InterpolationPropType] = js.undefined
  /**
    * The labels prop defines the labels that will appear above each point.
    * This prop should be given as an array or as a function of data.
    */
  var labels: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double] | js.Function] = js.undefined
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    */
  var samples: js.UndefOr[scala.Double] = js.undefined
  /**
    * Use the sortKey prop to indicate how data should be sorted. This prop
    * is given directly to the lodash sortBy function to be executed on the
    * final dataset.
    */
  var sortKey: js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Function] = js.undefined
  /**
    * The style prop specifies styles for your VictoryLine. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. in addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @examples{data: {stroke: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}

object VictoryLineProps {
  @scala.inline
  def apply(
    animate: AnimatePropTypeInterface = null,
    categories: CategoryPropType = null,
    containerComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    data: js.Array[_] = null,
    dataComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    domain: DomainPropType = null,
    events: js.Array[
      EventPropTypeInterface[
        victoryLib.victoryLibStrings.data | victoryLib.victoryLibStrings.labels | victoryLib.victoryLibStrings.parent, 
        scala.Double | java.lang.String
      ]
    ] = null,
    groupComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    height: scala.Int | scala.Double = null,
    interpolation: InterpolationPropType = null,
    label: java.lang.String | victoryLib.Anon_DataAnyString = null,
    labelComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    labels: js.Array[java.lang.String] | js.Array[scala.Double] | js.Function = null,
    name: java.lang.String = null,
    padding: scala.Double | victoryLib.Anon_BottomLeft = null,
    samples: scala.Int | scala.Double = null,
    scale: ScalePropType | D3Scale | victoryLib.Anon_XYD3Scale = null,
    sortKey: java.lang.String | js.Array[java.lang.String] | js.Function = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined,
    style: VictoryStyleInterface = null,
    theme: VictoryThemeDefinition = null,
    width: scala.Int | scala.Double = null,
    x: DataGetterPropType = null,
    y: DataGetterPropType = null
  ): VictoryLineProps = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (containerComponent != null) __obj.updateDynamic("containerComponent")(containerComponent)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataComponent != null) __obj.updateDynamic("dataComponent")(dataComponent)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelComponent != null) __obj.updateDynamic("labelComponent")(labelComponent)
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryLineProps]
  }
}

