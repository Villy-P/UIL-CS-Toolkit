<script lang="ts">
    import { page } from '$app/state';
  
    $: {
        if (typeof gtag !== 'undefined') {
            gtag('config', 'MEASUREMENT_ID', {
                page_title: document.title,
                page_path: page.url.pathname,
            })
        }
    }

    const MEASUREMENT_ID = "G-8H6NE2FWHD";
    const ANALYTICS_URL = "https://www.googletagmanager.com/gtag/js?id=" + MEASUREMENT_ID;
</script>
  
<svelte:head>
    <script async src={ANALYTICS_URL}></script>
    <script>
        window.dataLayer = window.dataLayer || []
        const MEASUREMENT_ID = "G-8H6NE2FWHD"
    
        function gtag() {
            dataLayer.push(arguments)
        }
    
        gtag('js', new Date())
        gtag('config', MEASUREMENT_ID)
    </script>
</svelte:head>