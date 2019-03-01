package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof fast-glob.fast-glob/out/managers/options.IOptions<fast-glob.fast-glob/out/types/entries.EntryItem> ]:? fast-glob.fast-glob/out/managers/options.IOptions<fast-glob.fast-glob/out/types/entries.EntryItem>[P]} */ trait Options extends js.Object {
  /**
    * If set to `true`, `globby` will automatically glob directories for you.
    * If you define an `Array` it will only glob files that matches the patterns inside the Array.
    * You can also define an `Object` with `files` and `extensions` like below:
    *
    * ```js
    * (async () => {
    *   const paths = await globby('images', {
    *     expandDirectories: {
    *       files: ['cat', 'unicorn', '*.jpg'],
    *       extensions: ['png']
    *     }
    *   });
    *   console.log(paths);
    *   //=> ['cat.png', 'unicorn.png', 'cow.jpg', 'rainbow.jpg']
    * })();
    * ```
    *
    * Note that if you set this option to `false`, you won't get back matched directories unless
    * you set `onlyFiles: false`.
    */
  var expandDirectories: js.UndefOr[globbyLib.ExpandDirectoriesOption] = js.undefined
  /**
    * Respect ignore patterns in `.gitignore` files that apply to the globbed files.
    */
  var gitignore: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    expandDirectories: globbyLib.ExpandDirectoriesOption = null,
    gitignore: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (expandDirectories != null) __obj.updateDynamic("expandDirectories")(expandDirectories.asInstanceOf[js.Any])
    if (!js.isUndefined(gitignore)) __obj.updateDynamic("gitignore")(gitignore)
    __obj.asInstanceOf[Options]
  }
}

