<script lang="ts">
	import '../app.css';
	import Footer from '../components/Footer.svelte';
	import Navbar from '../components/Navbar.svelte';
	let { children } = $props();
</script>

<Navbar/>
<div class="mt-14 min-h-[calc(100vh-120px)] wrapper">
	{@render children()}
</div>
<Footer/>


<style>
	.wrapper:after {
		content: "";
		display: block;
	}
</style>