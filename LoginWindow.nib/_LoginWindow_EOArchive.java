// _LoginWindow_EOArchive.java
// Generated by EnterpriseObjects palette at Saturday, February 10, 2007 11:28:10 PM US/Central

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.text.*;

public class _LoginWindow_EOArchive extends com.webobjects.eoapplication.EOArchive {
    com.webobjects.eointerface.swing.EOFrame _eoFrame0;
    com.webobjects.eointerface.swing.EOView _nsProgressIndicator0, _webClipView0, _webDynamicScrollBarsView0, _webFrameView0, _webView0;
    javax.swing.JButton _nsButton0;
    javax.swing.JPanel _nsView0;

    public _LoginWindow_EOArchive(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();

        _nsProgressIndicator0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "11");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "closeSheetButton")) != null)) {
            _nsButton0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (javax.swing.JButton)replacement;
            _replacedObjects.setObjectForKey(replacement, "_nsButton0");
        } else {
            _nsButton0 = (javax.swing.JButton)_registered(new javax.swing.JButton("Close Login Panel"), "NSButton");
        }

        _webClipView0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "");
        _webDynamicScrollBarsView0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "");
        _webFrameView0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "");

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "loginWebView")) != null)) {
            _webView0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOView)replacement;
            _replacedObjects.setObjectForKey(replacement, "_webView0");
        } else {
            _webView0 = (com.webobjects.eointerface.swing.EOView)_registered(new com.webobjects.eointerface.swing.EOView(), "WebView");
        }

        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "window")) != null)) {
            _eoFrame0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (com.webobjects.eointerface.swing.EOFrame)replacement;
            _replacedObjects.setObjectForKey(replacement, "_eoFrame0");
        } else {
            _eoFrame0 = (com.webobjects.eointerface.swing.EOFrame)_registered(new com.webobjects.eointerface.swing.EOFrame(), "Panel");
        }

        _nsView0 = (JPanel)_eoFrame0.getContentPane();
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_eoFrame0, _owner(), "delegate");
        }

        _nsButton0.addActionListener((com.webobjects.eointerface.swing.EOControlActionAdapter)_registered(new com.webobjects.eointerface.swing.EOControlActionAdapter(_owner(), "closeSheet", _nsButton0), ""));

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _connect(_owner(), _nsButton0, "closeSheetButton");
        }

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _connect(_owner(), _eoFrame0, "window");
        }

        if (_replacedObjects.objectForKey("_webView0") == null) {
            _connect(_owner(), _webView0, "loginWebView");
        }
    }

    protected void _init() {
        super._init();

        if (_replacedObjects.objectForKey("_nsButton0") == null) {
            _setFontForComponent(_nsButton0, "Lucida Grande", 13, Font.PLAIN);
            _nsButton0.setMargin(new Insets(0, 2, 0, 2));
        }

        if (!(_webDynamicScrollBarsView0.getLayout() instanceof EOViewLayout)) { _webDynamicScrollBarsView0.setLayout(new EOViewLayout()); }
        _webClipView0.setSize(626, 426);
        _webClipView0.setLocation(0, 0);
        ((EOViewLayout)_webDynamicScrollBarsView0.getLayout()).setAutosizingMask(_webClipView0, EOViewLayout.MinYMargin);
        _webDynamicScrollBarsView0.add(_webClipView0);
        if (!(_webFrameView0.getLayout() instanceof EOViewLayout)) { _webFrameView0.setLayout(new EOViewLayout()); }
        _webDynamicScrollBarsView0.setSize(626, 426);
        _webDynamicScrollBarsView0.setLocation(0, 0);
        ((EOViewLayout)_webFrameView0.getLayout()).setAutosizingMask(_webDynamicScrollBarsView0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
        _webFrameView0.add(_webDynamicScrollBarsView0);

        if (_replacedObjects.objectForKey("_webView0") == null) {
            if (!(_webView0.getLayout() instanceof EOViewLayout)) { _webView0.setLayout(new EOViewLayout()); }
            _webFrameView0.setSize(626, 426);
            _webFrameView0.setLocation(0, 0);
            ((EOViewLayout)_webView0.getLayout()).setAutosizingMask(_webFrameView0, EOViewLayout.WidthSizable | EOViewLayout.HeightSizable);
            _webView0.add(_webFrameView0);
        }

        if (!(_nsView0.getLayout() instanceof EOViewLayout)) { _nsView0.setLayout(new EOViewLayout()); }
        _webView0.setSize(626, 426);
        _webView0.setLocation(-7, -6);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_webView0, EOViewLayout.MinYMargin);
        _nsView0.add(_webView0);
        _nsProgressIndicator0.setSize(636, 20);
        _nsProgressIndicator0.setLocation(-12, 414);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsProgressIndicator0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsProgressIndicator0);
        _nsButton0.setSize(145, 26);
        _nsButton0.setLocation(240, -24);
        ((EOViewLayout)_nsView0.getLayout()).setAutosizingMask(_nsButton0, EOViewLayout.MinYMargin);
        _nsView0.add(_nsButton0);

        if (_replacedObjects.objectForKey("_eoFrame0") == null) {
            _nsView0.setSize(612, 424);
            _eoFrame0.setTitle("Login");
            _eoFrame0.setLocation(33, 291);
            _eoFrame0.setSize(612, 424);
        }
    }
}