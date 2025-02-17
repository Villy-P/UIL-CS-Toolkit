<script lang="ts">
    import { page } from '$app/state';

    const websiteName = "https://www.uil-cs-cheatsheet.vercel.app";
  
	interface Props {
		title?: string;
		description?: string;
		image?: any;
	}

	let { title = "Home | Example.com", description = "“Description of your website.”", image = `${websiteName}/favicon.png` }: Props = $props();
</script>
  
<svelte:head>
    <title>{title}</title>
    <meta name="description" content={description}>
    <meta property="og_site_name" content={websiteName}>
    <meta property="og:url" content="{websiteName}{page.url.pathname.toString()}">
    <meta property="og:type" content="website">
    <meta property="og:title" content="{title}">
    <meta property="og:description" content={description}>
    <meta property="og:image" content={image}>
  
    <meta name="twitter:card" content="summary_large_image">
    <meta property="twitter:domain" content={websiteName}>
    <meta property="twitter:url" content="{websiteName}{page.url.pathname.toString()}">
    <meta name="twitter:title" content="{title}">
    <meta name="twitter:description" content={description}>
    <meta name="twitter:image" content={image}>
    {@html `  <script type="application/ld+json">{
     "@context": "https://schema.org",
     "@type": "Website",
     "name": "${title} | example.com,
     "url": "https//www.example.com${page.url.pathname}",
     "logo": ${image}  }</script>`}
</svelte:head>