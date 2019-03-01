package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需飘红选项的数组，数组内部对象字段见下表
  		 */
  var badges: js.UndefOr[js.Array[stdLib.Partial[Badge]]] = js.undefined
  /**
  		 * 取消按钮文案。默认为‘取消’。注：Android平台此字段无效，不会显示取消按钮。
  		 */
  var cancelButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * （iOS特殊处理）指定按钮的索引号，从0开始，使用场景：需要删除或清除数据等类似场景，默认红色
  		 */
  var destructiveBtnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * 菜单按钮文字数组
  		 */
  var items: js.Array[java.lang.String]
  /**
  		 * 接口调用成功的回调函数
  		 */
  @JSName("success")
  var success_ActionSheetOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Index, scala.Unit]] = js.undefined
  /** 菜单标题 */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    items: js.Array[java.lang.String],
    badges: js.Array[stdLib.Partial[Badge]] = null,
    cancelButtonText: java.lang.String = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    destructiveBtnIndex: scala.Int | scala.Double = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_Index, scala.Unit] = null,
    title: java.lang.String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal(items = items)
    if (badges != null) __obj.updateDynamic("badges")(badges)
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (destructiveBtnIndex != null) __obj.updateDynamic("destructiveBtnIndex")(destructiveBtnIndex.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

