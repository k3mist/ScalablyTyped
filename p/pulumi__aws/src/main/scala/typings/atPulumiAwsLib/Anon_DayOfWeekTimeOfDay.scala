package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayOfWeekTimeOfDay extends js.Object {
  var dayOfWeek: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var timeOfDay: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var timeZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_DayOfWeekTimeOfDay {
  @scala.inline
  def apply(
    dayOfWeek: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    timeOfDay: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    timeZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_DayOfWeekTimeOfDay = {
    val __obj = js.Dynamic.literal(dayOfWeek = dayOfWeek.asInstanceOf[js.Any], timeOfDay = timeOfDay.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DayOfWeekTimeOfDay]
  }
}

