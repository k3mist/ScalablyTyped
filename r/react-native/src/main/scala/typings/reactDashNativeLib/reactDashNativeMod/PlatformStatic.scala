package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformStatic extends js.Object {
  var OS: PlatformOSType
  var Version: scala.Double | java.lang.String
  /**
    * @see https://facebook.github.io/react-native/docs/platform-specific-code.html#content
    */
  @JSName("select")
  def select_default[T](
    specifics: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any
  ): T
}

object PlatformStatic {
  @scala.inline
  def apply(
    OS: PlatformOSType,
    Version: scala.Double | java.lang.String,
    select_default: js.Function1[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ platform in react-native.react-native.PlatformOSType | 'default' ]:? T}
    */ reactDashNativeLib.reactDashNativeLibStrings.PlatformStatic with js.Any, 
      js.Any
    ]
  ): PlatformStatic = {
    val __obj = js.Dynamic.literal(OS = OS, Version = Version.asInstanceOf[js.Any], select_default = select_default)
  
    __obj.asInstanceOf[PlatformStatic]
  }
}

