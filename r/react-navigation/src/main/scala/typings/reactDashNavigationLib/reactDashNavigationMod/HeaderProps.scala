package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends NavigationTransitionProps {
  var mode: HeaderMode
  var router: NavigationRouter[NavigationState, NavigationStackScreenOptions]
  var style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  def getScreenDetails(navigationScene: NavigationScene): NavigationScreenDetails[NavigationStackScreenOptions]
  def leftInterpolator(props: NavigationSceneRendererProps): js.Object
  def rightInterpolator(props: NavigationSceneRendererProps): js.Object
  def titleInterpolator(props: NavigationSceneRendererProps): js.Object
}

object HeaderProps {
  @scala.inline
  def apply(
    getScreenDetails: NavigationScene => NavigationScreenDetails[NavigationStackScreenOptions],
    index: scala.Double,
    layout: NavigationLayout,
    leftInterpolator: NavigationSceneRendererProps => js.Object,
    mode: HeaderMode,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    progress: AnimatedValue,
    rightInterpolator: NavigationSceneRendererProps => js.Object,
    router: NavigationRouter[NavigationState, NavigationStackScreenOptions],
    scene: NavigationScene,
    scenes: js.Array[NavigationScene],
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle],
    titleInterpolator: NavigationSceneRendererProps => js.Object,
    screenProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(getScreenDetails = js.Any.fromFunction1(getScreenDetails), index = index, layout = layout, leftInterpolator = js.Any.fromFunction1(leftInterpolator), mode = mode, navigation = navigation, position = position, progress = progress, rightInterpolator = js.Any.fromFunction1(rightInterpolator), router = router, scene = scene, scenes = scenes, style = style.asInstanceOf[js.Any], titleInterpolator = js.Any.fromFunction1(titleInterpolator))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[HeaderProps]
  }
}

