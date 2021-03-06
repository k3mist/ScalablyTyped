```
/**
 * This module is a stub for core services such as Dependency Injection or Browser Location.
 * Core services may be implemented by a specific framework, such as ng1 or ng2, or be pure javascript.
 *
 * @publicapi @module common
 */ /** */
/** @publicapi @module core */
/**
 * Matches state names using glob-like pattern strings.
 *
 * Globs can be used in specific APIs including:
 *
 * - [[StateService.is]]
 * - [[StateService.includes]]
 * - The first argument to Hook Registration functions like [[TransitionService.onStart]]
 *    - [[HookMatchCriteria]] and [[HookMatchCriterion]]
 *
 * A `Glob` string is a pattern which matches state names.
 * Nested state names are split into segments (separated by a dot) when processing.
 * The state named `foo.bar.baz` is split into three segments ['foo', 'bar', 'baz']
 *
 * Globs work according to the following rules:
 *
 * ### Exact match:
 *
 * The glob `'A.B'` matches the state named exactly `'A.B'`.
 *
 * | Glob        |Matches states named|Does not match state named|
 * |:------------|:--------------------|:---------------------|
 * | `'A'`       | `'A'`               | `'B'` , `'A.C'`      |
 * | `'A.B'`     | `'A.B'`             | `'A'` , `'A.B.C'`    |
 * | `'foo'`     | `'foo'`             | `'FOO'` , `'foo.bar'`|
 *
 * ### Single star (`*`)
 *
 * A single star (`*`) is a wildcard that matches exactly one segment.
 *
 * | Glob        |Matches states named  |Does not match state named |
 * |:------------|:---------------------|:--------------------------|
 * | `'*'`       | `'A'` , `'Z'`        | `'A.B'` , `'Z.Y.X'`       |
 * | `'A.*'`     | `'A.B'` , `'A.C'`    | `'A'` , `'A.B.C'`         |
 * | `'A.*.*'`   | `'A.B.C'` , `'A.X.Y'`| `'A'`, `'A.B'` , `'Z.Y.X'`|
 *
 * ### Double star (`**`)
 *
 * A double star (`'**'`) is a wildcard that matches *zero or more segments*
 *
 * | Glob        |Matches states named                           |Does not match state named         |
 * |:------------|:----------------------------------------------|:----------------------------------|
 * | `'**'`      | `'A'` , `'A.B'`, `'Z.Y.X'`                    | (matches all states)              |
 * | `'A.**'`    | `'A'` , `'A.B'` , `'A.C.X'`                   | `'Z.Y.X'`                         |
 * | `'**.X'`    | `'X'` , `'A.X'` , `'Z.Y.X'`                   | `'A'` , `'A.login.Z'`             |
 * | `'A.**.X'`  | `'A.X'` , `'A.B.X'` , `'A.B.C.X'`             | `'A'` , `'A.B.C'`                 |
 *
 */
/**
 * Higher order functions
 *
 * These utility functions are exported, but are subject to change without notice.
 *
 * @module common_hof
 */ /** */
/** @publicapi @module common */ /** */
/**
 * Functions that manipulate strings
 *
 * Although these functions are exported, they are subject to change without notice.
 *
 * @module common_strings
 */ /** */
/** @publicapi @module core */ /** */
/** @publicapi @module common */ /** */
/**
 * # Core classes and interfaces
 *
 * The classes and interfaces that are core to ui-router and do not belong
 * to a more specific subsystem (such as resolve).
 *
 * @preferred @publicapi @module core
 */ /** */
/**
 * This module contains code for State Parameters.
 *
 * See [[ParamDeclaration]]
 *
 * @preferred @publicapi @module params
 */ /** */
/** @publicapi @module params */ /** */
/** @publicapi @module params */ /** */
/** @internalapi @module path */ /** */
/** @internalapi @module path */ /** */
/** @publicapi @module resolve */ /** */
/**
 * An interface which is similar to an Angular 2 `Provider`
 */
/** @publicapi @module core */ /** */
/**
 * # The state subsystem
 *
 * This subsystem implements the ui-router state tree
 *
 * - The [[StateService]] has state-related service methods such as:
 *   - [[StateService.get]]: Get a registered [[StateDeclaration]] object
 *   - [[StateService.go]]: Transition from the current state to a new state
 *   - [[StateService.reload]]: Reload the current state
 *   - [[StateService.target]]: Get a [[TargetState]] (useful when redirecting from a Transition Hook)
 *   - [[StateService.onInvalid]]: Register a callback for when a transition to an invalid state is started
 *   - [[StateService.defaultErrorHandler]]: Register a global callback for when a transition errors
 * - The [[StateDeclaration]] interface defines the shape of a state declaration
 * - The [[StateRegistry]] contains all the registered states
 *   - States can be added/removed using the [[StateRegistry.register]] and [[StateRegistry.deregister]]
 *     - Note: Bootstrap state registration differs by front-end framework.
 *   - Get notified of state registration/deregistration using [[StateRegistry.onStatesChanged]].
 *
 * @preferred @publicapi @module state
 */ /** */
/** @publicapi @module state */ /** */
/** @publicapi @module state */ /** */
/** @publicapi @module state */ /** */
/** @publicapi @module state */ /** */
/**
 * # Transition subsystem
 *
 * This module contains APIs related to a Transition.
 *
 * See:
 * - [[TransitionService]]
 * - [[Transition]]
 * - [[HookFn]], [[TransitionHookFn]], [[TransitionStateHookFn]], [[HookMatchCriteria]], [[HookResult]]
 *
 * @preferred @publicapi @module transition
 */ /** */
/** @publicapi @module transition */ /** */
/** @publicapi @module transition */ /** */
/** @publicapi @module transition */ /** */
/** @publicapi @module transition */ /** */
/** @publicapi @module url */ /** */
/**
 * # URL subsystem
 *
 * Contains code related to managing the URL
 *
 * The primary API is found in [[UrlService]], [[UrlService.config]], and [[UrlService.rules]].
 *
 * @preferred @publicapi @module url
 */ /** */
/** @publicapi @module url */ /** */
/** @publicapi @module url */ /** */
/** @publicapi @module url */ /** */
/** @publicapi @module url */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/**
 * Naive, pure JS implementation of core ui-router services
 *
 * @internalapi @module vanilla
 */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/** @internalapi @module vanilla */ /** */
/** @publicapi @module view */ /** */
/** @publicapi @module view */ /** */
/** @publicapi @module view */ /** */
```