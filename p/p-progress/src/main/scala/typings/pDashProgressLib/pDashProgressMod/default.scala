package typings
package pDashProgressLib.pDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-progress", JSImport.Default)
@js.native
class default[T] protected () extends PProgress[T] {
  /**
  	 * Same as the [`Promise` constructor](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise).
  	 *
  	 * @param executor - Same as the `Promise` constructor but with an appended `progress` parameter in `executor`.
  	 */
  def this(/**
  		 * @param progress - Call this with progress updates. It expects a number between 0 and 1.
  		 *
  		 * Multiple calls with the same number will result in only one `onProgress()` event.
  		 *
  		 * Progress percentage `1` is reported for you when the promise resolves. If you set it yourself, it will simply be ignored.
  		 */
  executor: js.Function3[
      /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      /* progress */ ProgressNotifier, 
      scala.Unit
    ]) = this()
}

/* static members */
@JSImport("p-progress", JSImport.Default)
@js.native
object default extends js.Object {
  def all[ValueType1](
    promises: js.Array[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Array[ValueType1]] = js.native
  def all[ValueType1](
    promises: js.Array[pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1]],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Array[ValueType1]] = js.native
  def all[AllValuesType](
    promises: stdLib.Iterable[
      js.Thenable[AllValuesType] | pDashProgressLib.pDashProgressMod.PromiseFactory[AllValuesType]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[AllValuesType] = js.native
  def all[AllValuesType](
    promises: stdLib.Iterable[pDashProgressLib.pDashProgressMod.PromiseFactory[AllValuesType]],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[AllValuesType] = js.native
  def all[ValueType1, ValueType2](
    promises: js.Tuple2[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple2[ValueType1, ValueType2]] = js.native
  def all[ValueType1, ValueType2](
    promises: js.Tuple2[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple2[ValueType1, ValueType2]] = js.native
  def all[ValueType1, ValueType2, ValueType3](
    promises: js.Tuple3[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple3[ValueType1, ValueType2, ValueType3]] = js.native
  def all[ValueType1, ValueType2, ValueType3](
    promises: js.Tuple3[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple3[ValueType1, ValueType2, ValueType3]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4](
    promises: js.Tuple4[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple4[ValueType1, ValueType2, ValueType3, ValueType4]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4](
    promises: js.Tuple4[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple4[ValueType1, ValueType2, ValueType3, ValueType4]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5](
    promises: js.Tuple5[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple5[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5](
    promises: js.Tuple5[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[js.Tuple5[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6](
    promises: js.Tuple6[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple6[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6](
    promises: js.Tuple6[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple6[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7](
    promises: js.Tuple7[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple7[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7](
    promises: js.Tuple7[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple7[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8](
    promises: js.Tuple8[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7], 
      js.Thenable[ValueType8] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType8]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple8[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8](
    promises: js.Tuple8[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType8]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple8[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9](
    promises: js.Tuple9[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7], 
      js.Thenable[ValueType8] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType8], 
      js.Thenable[ValueType9] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType9]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple9[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9
    ]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9](
    promises: js.Tuple9[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType8], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType9]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple9[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9
    ]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9, ValueType10](
    promises: js.Tuple10[
      js.Thenable[ValueType1] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7], 
      js.Thenable[ValueType8] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType8], 
      js.Thenable[ValueType9] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType9], 
      js.Thenable[ValueType10] | pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType10]
    ]
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple10[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9, 
      ValueType10
    ]
  ] = js.native
  /**
  	 * Convenience method to run multiple promises and get a total progress of all of them. It counts normal promises with progress `0` when pending and progress `1` when resolved. For `PProgress` type promises, it listens to their `onProgress()` method for more fine grained progress reporting. You can mix and match normal promises and `PProgress` promises.
  	 *
  	 * @param promises - Array of promises or promise-returning functions, similar to [p-all](https://github.com/sindresorhus/p-all).
  	 *
  	 * @example
  	 *
  	 * import PProgress from 'p-progress';
  	 * import delay from 'delay';
  	 *
  	 * const progressPromise = PProgress.fn(async progress => {
  	 * 	progress(0.14);
  	 * 	await delay(52);
  	 * 	progress(0.37);
  	 * 	await delay(104);
  	 * 	progress(0.41);
  	 * 	await delay(26);
  	 * 	progress(0.93);
  	 * 	await delay(55);
  	 *  });
  	 *
  	 *  const allProgressPromise = PProgress.all([
  	 * 	delay(103),
  	 * 	progressPromise(),
  	 * 	delay(55),
  	 * 	delay(209)
  	 * ]);
  	 *
  	 * (async () => {
  	 * 	allProgressPromise.onProgress(console.log);
  	 * 	//=> 0.0925
  	 * 	//=> 0.3425
  	 * 	//=> 0.5925
  	 * 	//=> 0.6025
  	 * 	//=> 0.7325
  	 * 	//=> 0.9825
  	 * 	//=> 1
  	 *
  	 * 	await allProgressPromise;
  	 * })();
  	 */
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9, ValueType10](
    promises: js.Tuple10[
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType1], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType2], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType3], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType4], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType5], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType6], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType7], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType8], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType9], 
      pDashProgressLib.pDashProgressMod.PromiseFactory[ValueType10]
    ],
    options: pDashProgressLib.pDashProgressMod.Options
  ): pDashProgressLib.pDashProgressMod.PProgress[
    js.Tuple10[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9, 
      ValueType10
    ]
  ] = js.native
  def fn[ReturnType](input: js.Function1[/* repeated */ js.Any, js.Thenable[ReturnType]]): js.Function1[/* repeated */ js.Any, pDashProgressLib.pDashProgressMod.PProgress[ReturnType]] = js.native
  def fn[ParameterType1, ReturnType](
    input: js.Function2[
      /* parameter1 */ ParameterType1, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function1[
    /* parameter1 */ ParameterType1, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ReturnType](
    input: js.Function3[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function2[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ReturnType](
    input: js.Function4[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function3[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ReturnType](
    input: js.Function5[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function4[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ReturnType](
    input: js.Function6[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function5[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ReturnType](
    input: js.Function7[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function6[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ReturnType](
    input: js.Function8[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function7[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ParameterType8, ReturnType](
    input: js.Function9[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* parameter8 */ ParameterType8, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function8[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    /* parameter8 */ ParameterType8, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ParameterType8, ParameterType9, ReturnType](
    input: js.Function10[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* parameter8 */ ParameterType8, 
      /* parameter9 */ ParameterType9, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function9[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    /* parameter8 */ ParameterType8, 
    /* parameter9 */ ParameterType9, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ParameterType8, ParameterType9, ParameterType10, ReturnType](
    input: js.Function11[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* parameter8 */ ParameterType8, 
      /* parameter9 */ ParameterType9, 
      /* parameter10 */ ParameterType10, 
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function10[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    /* parameter8 */ ParameterType8, 
    /* parameter9 */ ParameterType9, 
    /* parameter10 */ ParameterType10, 
    pDashProgressLib.pDashProgressMod.PProgress[ReturnType]
  ] = js.native
  /**
  	 * Convenience method to make your promise-returning or async function report progress.
  	 *
  	 * The function you specify will have the `progress()` function appended to its parameters.
  	 *
  	 * @example
  	 *
  	 * import PProgress from 'p-progress';
  	 *
  	 * const runJob = PProgress.fn(async (name, progress) => {
  	 * 	const job = new Job(name);
  	 *
  	 * 	job.on('data', data => {
  	 * 		progress(data.length / job.totalSize);
  	 * 	});
  	 *
  	 * 	await job.run();
  	 * });
  	 *
  	 * (async () => {
  	 * 	const progressPromise = runJob('Gather rainbows');
  	 *
  	 * 	progressPromise.onProgress(console.log);
  	 * 	//=> 0.09
  	 * 	//=> 0.23
  	 * 	//=> 0.59
  	 * 	//=> 0.75
  	 * 	//=> 1
  	 *
  	 * 	await progressPromise;
  	 * })();
  	 */
  @JSName("fn")
  def fn_ReturnTypeFunction0[ReturnType](
    input: js.Function1[
      /* progress */ pDashProgressLib.pDashProgressMod.ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function0[pDashProgressLib.pDashProgressMod.PProgress[ReturnType]] = js.native
}

