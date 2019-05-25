import * as app from './build/app.core.js';
import 'haul/hot/patch';
import {
    makeHot,
    tryUpdateSelf,
    callOnce,
    clearCacheFor,
    redraw
} from 'haul/hot';

callOnce(app.init);

if (module.hot) {
    module.hot.accept(() => {})
    module.hot.accept('./build/app.core.js', () => {
        clearCacheFor(require.resolve('./build/app.core.js'));
        redraw(() => require('./build/app.core.js').root());
    });
}
